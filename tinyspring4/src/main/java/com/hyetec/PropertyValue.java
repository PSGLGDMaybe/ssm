package com.hyetec;

/**
 * @Classname PropertyValue
 * @Description TODO
 * @Date 2019/7/28 16:00
 * @Created by wuhaitao
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
