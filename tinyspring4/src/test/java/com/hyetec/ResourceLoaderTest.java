package com.hyetec;

import com.hyetec.io.Resource;
import com.hyetec.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname ResourceLoaderTest
 * @Description TODO
 * @Date 2019/7/29 15:11
 * @Created by wuhaitao
 */
public class ResourceLoaderTest {

    @Test
    public void resourceLoaderTest() throws IOException {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("test.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
