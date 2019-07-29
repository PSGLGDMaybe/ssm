package com.hyetec.factory;

import com.hyetec.BeanDefinition;
import com.hyetec.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Classname AutowireCapableBeanfactory
 * @Description TODO
 * @Date 2019/7/29 14:40
 * @Created by wuhaitao
 */
public class AutowireCapableBeanfactory extends AbstractBeanFactory {

    @Override
    protected Object initBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        addPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void addPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }
    }
}
