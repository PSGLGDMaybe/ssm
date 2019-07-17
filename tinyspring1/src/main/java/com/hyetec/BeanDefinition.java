package com.hyetec;

/**
 * @Classname BeanDefinition
 * @Description Bean对象
 * @Date 2019/7/17 14:27
 * @Created by wuhaitao
 */
public class BeanDefinition {

    private Object bean;

    /**
     * 构造bean
     * @param bean
     */
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    /**
     * 获取bean
     * @return
     */
    public Object getBean() {
        return bean;
    }
}
