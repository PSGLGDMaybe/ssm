package com.hyetec;

import com.hyetec.io.ResourceLoader;
import com.hyetec.xml.XmlBeanDefinitionReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * @Classname XmlBeanDefinitionReaderTest
 * @Description TODO
 * @Date 2019/7/29 15:21
 * @Created by wuhaitao
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void xmlBeanDefinitionReaderTest() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("test.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertNotNull(registry);
    }
}
