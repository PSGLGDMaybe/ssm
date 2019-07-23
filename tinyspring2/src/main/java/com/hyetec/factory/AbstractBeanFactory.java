package com.hyetec.factory;

import com.hyetec.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname AbstractBeanFactory
 * @Description TODO
 * @Date 2019/7/23 8:54
 * @Created by wuhaitao
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     *
     * @return 返回Bean对象
     */
    @Override
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     *
     * @param name  Bean名称
     * @param beanDefinition  Bean对象
     */
    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = initBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    /**
     * 初始化Bean
     * @param beanDefinition
     * @return
     */
    public abstract Object initBean(BeanDefinition beanDefinition);
}
