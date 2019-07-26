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
     * 添加属性  list前面由final不代表不能使用add方法，而是指list的引用不能够再指向其他对象
     * 只能指向当前已创建的对象
     * @param propertyValue
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
