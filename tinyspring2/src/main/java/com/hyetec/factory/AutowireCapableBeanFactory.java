package com.hyetec.factory;

import com.hyetec.BeanDefinition;

/**
 * @Classname AutowireCapableBeanFactory
 * @Description TODO
 * @Date 2019/7/23 13:14
 * @Created by wuhaitao
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     *
     * @param beanDefinition
     * @return
     */
    @Override
    public Object initBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
