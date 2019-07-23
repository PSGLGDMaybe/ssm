package com.hyetec.factory;

import com.hyetec.BeanDefinition;

/**
 * @Classname BeanFactory
 * @Description TODO
 * @Date 2019/7/17 17:34
 * @Created by wuhaitao
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
