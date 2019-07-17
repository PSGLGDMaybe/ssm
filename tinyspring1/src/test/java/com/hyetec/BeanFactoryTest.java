package com.hyetec;

import org.junit.Test;

/**
 * @Classname BeanFactoryTest
 * @Description 测试
 * @Date 2019/7/17 14:22
 * @Created by wuhaitao
 */
public class BeanFactoryTest {

    @Test
    public void beanFactoryTest() {
        //1.初始化Bean工厂
        BeanFactory beanFactory = new BeanFactory();

        //2.注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new TestService());
        beanFactory.registerBeanDefinition("testService", beanDefinition);

        //3.获取bean
        TestService testService = (TestService) beanFactory.getBean("testService");
        testService.Main();
    }
}
