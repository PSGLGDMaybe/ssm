package com.hyetec;

import com.hyetec.factory.AutowireCapableBeanfactory;
import com.hyetec.factory.BeanFactory;
import com.hyetec.io.ResourceLoader;
import com.hyetec.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @Classname BeanFactoryTest
 * @Description TODO
 * @Date 2019/7/28 15:57
 * @Created by wuhaitao
 */
public class BeanFactoryTest {

    @Test
    public void beanFactoryTest() throws Exception {

        //读取配置文件信息
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("test.xml");

        //初始化工厂并注册Bean
        BeanFactory beanFactory = new AutowireCapableBeanfactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        //测试
        TestService testService = (TestService) beanFactory.getBean("testService");
        testService.test();

    }
}
