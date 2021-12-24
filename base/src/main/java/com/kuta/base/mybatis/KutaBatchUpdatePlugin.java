package com.kuta.base.mybatis;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.config.MergeConstants;

import com.kuta.base.database.SqlMapperGeneratorTool;

/**
 * KSF框架Mybatis批量更新插件
 * */
public class KutaBatchUpdatePlugin extends org.mybatis.generator.api.PluginAdapter{

	/**
	 * 批量更新字符定义
	 * */
	private final static String BATCH_UPDATE = "batchUpdate";

	/**
	 * 参数名称
	 * */
    private final static String PARAMETER_NAME = "recordList";


    /**
     * 验证参数的正确性
     * @param list 参数列表
     * @return 当结果为true时正常执行，当结果为false时退出当前插件
     * */
    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    /**
     * 当mybatis的版本为MYBATIS3时，生成批量更新方法
     * @param interfaze 对类的封装
     * @param topLevelClass 对Java类的DOM封装
     * @param introspectedTable 是MBG提供的一个比较基础的扩展类，相当于可以重新定义一个runtime，同时，IntrospectedTable也是一个比较低级的扩展点，比较适合做低级的扩展，比如想使用FreeMarker或者Velocity来生成代码
     * @return 执行结果
     * */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        if (introspectedTable.getTargetRuntime().equals(IntrospectedTable.TargetRuntime.MYBATIS3)) {
            MethodGeneratorTool.defaultBatchInsertOrUpdateMethodGen(MethodGeneratorTool.UPDATE, interfaze, introspectedTable, context);
        }
        return super.clientGenerated(interfaze, topLevelClass, introspectedTable);
    }

    /**
     * 	当运行时为MYBATIS3时生成xml文档
     * @param document xml文档描述
     * @param introspectedTable 是MBG提供的一个比较基础的扩展类，相当于可以重新定义一个runtime，同时，IntrospectedTable也是一个比较低级的扩展点，比较适合做低级的扩展，比如想使用FreeMarker或者Velocity来生成代码
     * @return 执行结果
     * */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        if (introspectedTable.getTargetRuntime().equals(IntrospectedTable.TargetRuntime.MYBATIS3)) {
            addSqlMapper(document, introspectedTable);
        }
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }
    /**
     * 生成xml文档
     * @param document xml文档描述
     * @param introspectedTable 是MBG提供的一个比较基础的扩展类，相当于可以重新定义一个runtime，同时，IntrospectedTable也是一个比较低级的扩展点，比较适合做低级的扩展，比如想使用FreeMarker或者Velocity来生成代码
     * */
    public void addSqlMapper(Document document, IntrospectedTable introspectedTable) {
    	String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
        List<IntrospectedColumn> columnList = introspectedTable.getAllColumns();
        //primaryKey的JDBC名字
//        if(introspectedTable.getPrimaryKeyColumns().size() == 0) {
//        	return;
//        }
        String primaryKeyName = introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName();

        //primaryKey的JAVA变量
        String primaryKeyParameterClause = MyBatis3FormattingUtilities.getParameterClause(introspectedTable.getPrimaryKeyColumns().get(0), "item.");

        //primaryKey的JAVA名字
//        String primaryKeyJavaName = introspectedTable.getPrimaryKeyColumns().get(0).getJavaProperty();
        

        XmlElement updateXmlElement = SqlMapperGeneratorTool.baseElementGenerator(SqlMapperGeneratorTool.UPDATE,
                BATCH_UPDATE,
                FullyQualifiedJavaType.getNewListInstance());
        updateXmlElement.addElement(new TextElement("<!-- generated by Kuta batchUpdate plugin - " 
                + MergeConstants.NEW_ELEMENT_TAG + " -->"));
        updateXmlElement.addElement(new TextElement(String.format("update %s ", tableName)));

        XmlElement trimElement = SqlMapperGeneratorTool.baseTrimElement("set", null, ",");

        for (int i = 0; i < columnList.size(); i++) {
        	
            IntrospectedColumn introspectedColumn = columnList.get(i);

            String columnName = introspectedColumn.getActualColumnName();

            String columnJavaTypeName = introspectedColumn.getJavaProperty("item.");

            String parameterClause = MyBatis3FormattingUtilities.getParameterClause(introspectedColumn, "item.");
            

            if (introspectedTable.getPrimaryKeyColumns().contains(introspectedColumn)) {
            	System.out.println("主键:" + introspectedColumn.getActualColumnName() + "跳过");
                continue;
            }

            String ifSql = String.format("when %s then %s", primaryKeyParameterClause, parameterClause);
            XmlElement ifElement = SqlMapperGeneratorTool.baseIfJudgeElementGen(columnJavaTypeName, ifSql, false);

            String ifNullSql = String.format("when %s then %s", primaryKeyParameterClause, tableName + "." + columnName);
            XmlElement ifNullElement = SqlMapperGeneratorTool.baseIfJudgeElementGen(columnJavaTypeName, ifNullSql, true);


            XmlElement foreachElement = SqlMapperGeneratorTool.baseForeachElementGenerator(PARAMETER_NAME, "item", "index", null);
            foreachElement.addElement(ifElement);
            foreachElement.addElement(ifNullElement);

            
            
            XmlElement caseTrimElement = SqlMapperGeneratorTool.baseTrimElement("`" + columnName + "`" + " =case `" + primaryKeyName + "`", "end,", null);
            caseTrimElement.addElement(foreachElement);

            trimElement.addElement(caseTrimElement);
        }

        updateXmlElement.addElement(trimElement);

        XmlElement foreachElement = SqlMapperGeneratorTool.baseForeachElementGenerator(PARAMETER_NAME,
                "item",
                "index",
                ",");
        foreachElement.addElement(new TextElement(primaryKeyParameterClause));

        updateXmlElement.addElement(new TextElement(String.format("where `%s` in(", primaryKeyName)));

        updateXmlElement.addElement(foreachElement);

        updateXmlElement.addElement(new TextElement(")"));
        
        document.getRootElement().addElement(updateXmlElement);
    }

	

	

}
