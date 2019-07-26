package com.hyetec;

import com.hyetec.factory.AutowireCapableBeanFactory;
import com.hyetec.factory.BeanFactory;
import org.junit.Test;

/**
 * @Classname BeanFactoryTest
 * @Description TODO
 * @Date 2019/7/24 23:11
 * @Created by wuhaitao
 */
public class BeanFactoryTest {

    @Test
    public void setBeanFactoryTest() throws Exception {

        //创建Bean工厂
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //创建Bean包装对象
        BeanDefinition beanDefinition = new BeanDefinition();
        /*这里通过类全限定名来反射创建对象,创建对象我们已经交给了工厂本身,通过registerBeanDefinition方法
          自动创建Bean对象并初始化，
        */
        beanDefinition.setBeanClassName("com.hyetec.TestService");

        //设置属性
        PropertyValues  propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("property", "PSGLGD_Maybe"));
        beanDefinition.setPropertyValues(propertyValues);

        //初始化Bean并注入Bean包装对象到工厂
        beanFactory.registerBeanDefinition("TestService", beanDefinition);

        //测试
        TestService testService = (TestService) beanFactory.getBean("TestService");
        testService.test();
    }



}
