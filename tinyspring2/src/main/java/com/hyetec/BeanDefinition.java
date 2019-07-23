package com.hyetec;

/**
 * @Classname BeanDefinition
 * @Description TODO
 * @Date 2019/7/23 8:56
 * @Created by wuhaitao
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    public BeanDefinition() {}

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getBeanClassName() {
        return beanClassName;
    }
}
