package com.hyetec.factory;

import com.hyetec.BeanDefinition;
import com.hyetec.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Classname AutowireCapableBeanFactory
 * @Description
 *      自动配置Bean工厂 ：
 *         这里根本就是将Bean包装对象注入到当前Bean工厂内，本质是将BeanDefinition对象set到map里
 *         Bean工厂本身相当于是一个map。
 *
 * @Date 2019/7/25 16:50
 * @Created by wuhaitao
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 初始化Bean包装对象里的Bean对象
     * @param beanDefinition
     * @return
     * @throws Exception
     */
    @Override
    protected Object initBean(BeanDefinition beanDefinition) throws Exception {
        //创建Bean包装对象里的Bean对象
        Object bean = createBeanInstance(beanDefinition);
        //给bean对象赋属性值
        addPropertyValues(bean, beanDefinition);
        return bean;
    }

    /**
     * 创建Bean包装对象里的Bean对象
     * @param beanDefinition
     * @return
     * @throws Exception
     */
    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return Class.forName(beanDefinition.getBeanClassName()).newInstance();
    }

    /**
     * 通过暴力反射属性  给Bean对象属性设置值
     * @param bean
     * @param beanDefinition
     * @throws Exception
     */
    protected void addPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception{
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
