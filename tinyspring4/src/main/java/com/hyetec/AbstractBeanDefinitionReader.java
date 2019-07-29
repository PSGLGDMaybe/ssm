package com.hyetec;

import com.hyetec.io.ResourceLoader;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname AbstractBeanDefinitionReader
 * @Description TODO
 * @Date 2019/7/28 17:49
 * @Created by wuhaitao
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        registry = new ConcurrentHashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
