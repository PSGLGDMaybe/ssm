package com.hyetec;

import java.util.Properties;

/**
 * @Classname BeanDefinition
 * @Description TODO
 * @Date 2019/7/24 20:12
 * @Created by wuhaitao
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    private PropertyValues propertyValues;

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void  setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClassName(String name) {
        this.beanClassName = name;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}