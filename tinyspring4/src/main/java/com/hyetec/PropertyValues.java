package com.hyetec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Classname PropertyValues
 * @Description TODO
 * @Date 2019/7/28 16:03
 * @Created by wuhaitao
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }
}
