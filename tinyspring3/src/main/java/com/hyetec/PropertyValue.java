package com.hyetec;

/**
 * @Classname PropertyValue
 * @Description 属性包括属性名和属性值
 * @Date 2019/7/24 20:16
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
