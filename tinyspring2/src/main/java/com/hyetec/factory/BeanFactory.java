package com.hyetec.factory;

/**
 * @Classname BeanFactory
 * @Description TODO
 * @Date 2019/7/17 17:34
 * @Created by wuhaitao
 */
public interface BeanFactory {

    Object getBean();

    void registerBeanDefinition();
}
