package com.hyetec.xml;

import com.hyetec.AbstractBeanDefinitionReader;
import com.hyetec.BeanDefinition;
import com.hyetec.PropertyValue;
import com.hyetec.io.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

/**
 * @Classname XmlBeanDefinitionReader
 * @Description TODO
 * @Date 2019/7/28 17:48
 * @Created by wuhaitao
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(ResourceLoader resourceLoader) {
        super(resourceLoader);
    }

    /**
     * 加载BeanDefinitions
     * @param location
     * @throws Exception
     */
    @Override
    public void loadBeanDefinitions(String location) throws Exception {
        InputStream inputStream = getResourceLoader().getResource(location).getInputStream();
        doLoadBeanDefinitions(inputStream);
    }

     /**
      * DocumentBuilderFactory :定义工厂API，使应用程序能够从XML文档获取生成DOM对象树的解析器。
     *  具体过程通过解析器去读取BeanDefinitions
     * @param inputStream
     */
    protected void doLoadBeanDefinitions(InputStream inputStream) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);
        registerBeanDefinition(document);
        inputStream.close();
    }

    /**
     * 获取BeanDefinition对象
     * @param document
     */
    public void registerBeanDefinition(Document document) {
        Element rootElement = document.getDocumentElement();
        parseBeanDefinition(rootElement);
    }

    /**
     * 获取根元素底下的子元素
     * @param rootElement
     */
    protected void parseBeanDefinition(Element rootElement) {
        NodeList childNodes = rootElement.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Element element = (Element) item;
                processBeanDefinition(element);
            }
        }
    }

    /**
     *  子元素读取  得到Bean对象
     * @param element
     */
    protected void processBeanDefinition(Element element) {
        String name = element.getAttribute("name");
        String className = element.getAttribute("class");
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName(className);
        processProperty(element, beanDefinition);
        getRegistry().put(name, beanDefinition);
    }

    /**
     * 属性读取
     * @param element
     * @param beanDefinition
     */
    private void processProperty(Element element, BeanDefinition beanDefinition) {
        NodeList propertyNode = element.getElementsByTagName("property");
        for (int i = 0; i < propertyNode.getLength(); i++) {
            Node item = propertyNode.item(i);
            if (item instanceof Element) {
                Element property = (Element) item;
                String name = property.getAttribute("name");
                String value = property.getAttribute("value");
                beanDefinition.getPropertyValues().addPropertyValue(new PropertyValue(name, value));
            }
        }
    }
}
