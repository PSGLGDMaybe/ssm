package com.hyetec.factory;

import com.hyetec.BeanDefinition;
import com.hyetec.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Classname AutowireCapableBeanFactory
 * @Description TODO
 * @Date 2019/7/25 16:50
 * @Created by wuhaitao
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object initBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        addPropertyValues(bean, beanDefinition);
        return bean;
    }

    /**
     * 产生Bean对象
     * @param beanDefinition
     * @return
     * @throws Exception
     */
    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return beanDefinition.getBeanClass().newInstance();
    }

    /**
     * 通过反射给Bean对象属性设置值
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
