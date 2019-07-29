package com.hyetec;

/**
 * @Classname BeanDefinitionReader
 * @Description Bean封装对象读取文件信息接口
 * @Date 2019/7/28 16:11
 * @Created by wuhaitao
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
