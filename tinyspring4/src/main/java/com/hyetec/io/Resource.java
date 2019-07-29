package com.hyetec.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname Resource
 * @Description 定位资源的接口
 * @Date 2019/7/28 16:18
 * @Created by wuhaitao
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
