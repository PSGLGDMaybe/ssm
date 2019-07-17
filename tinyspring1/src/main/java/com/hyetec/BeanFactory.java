package com.hyetec;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname BeanFactory
 * @Description Bean对象容器
 * @Date 2019/7/17 14:22
 * @Created by wuhaitao
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 获取一个Bean
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册Bean
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
