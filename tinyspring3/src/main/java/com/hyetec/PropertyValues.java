package com.hyetec;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname PropertyValues
 * @Description TODO
 * @Date 2019/7/24 23:12
 * @Created by wuhaitao
 */
public class PropertyValues {

    //属性集合
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {}

    /**
     * 添加属性
     * @param propertyValue
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
