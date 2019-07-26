package com.hyetec;

/**
 * @Classname TestService
 * @Description TODO
 * @Date 2019/7/26 9:46
 * @Created by wuhaitao
 */
public class TestService {

    private String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void test() {
        System.out.println(property);
    }
}
