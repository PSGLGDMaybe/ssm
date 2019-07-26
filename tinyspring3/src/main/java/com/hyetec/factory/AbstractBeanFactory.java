package com.hyetec.factory;

import com.hyetec.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname AbstractBeanFactory
 * @Description TODO
 * @Date 2019/7/25 16:43
 * @Created by wuhaitao
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 在工厂里注册Bean包装对象
     * @param name
     * @param beanDefinition
     * @throws Exception
     */
    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = initBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    protected abstract Object initBean(BeanDefinition beanDefinition) throws Exception;
}
