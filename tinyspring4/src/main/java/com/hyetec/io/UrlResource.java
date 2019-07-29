package com.hyetec.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Classname UrlResource
 * @Description TODO
 * @Date 2019/7/28 16:19
 * @Created by wuhaitao
 */
public class UrlResource implements Resource{

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    /**
     * 拿到指定文件的输入流
     * @return
     * @throws IOException
     */
    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
