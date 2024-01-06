package com.example.createdesignmodel.utils;

import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author qzh
 * @Description:
 * @date 2024/1/6 21:47
 */
public class XMLUtil {
    //该方法用于从xml配置文件中提取具体类的类名，并返回一个实例对象
    public static Object getBeanByXml(String url){
        if(StringUtils.isEmpty(url)){
            return null;
        }
        try {
            // 获取当前类加载器
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            //创建DOM文本对象
            DocumentBuilderFactory dbBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(classLoader.getResourceAsStream(url));

            //获取包含类型的文本节点
            NodeList classNameNodeList = document.getElementsByTagName("className");
            Node classNode = classNameNodeList.item(0).getFirstChild();
            String nodeValue = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class<?> aClass = Class.forName(nodeValue);
            return aClass.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
