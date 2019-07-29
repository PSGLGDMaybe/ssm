package com.hyetec.io;

import java.net.URL;

/**
 * @Classname ResourceLoader
 * @Description 获取指定资源
 * @Date 2019/7/28 16:17
 * @Created by wuhaitao
 */
public class ResourceLoader {

    /**
     * 这里使用到了ClassLoader.getResource(String name),name代表资源的路径
     * 其与Class.getResource(String name)的区别是：前者不能使用绝对路径，
     * 后者既可以使用绝对路径又可以使用相对路径。
     * @param location
     * @return
     */
    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
