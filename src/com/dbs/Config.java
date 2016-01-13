package com.dbs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
    private static Properties properties;
    public static int width;
    public static int height;
    public static String title;

    public static void load()
    {
        properties = new Properties();

        InputStream is = Config.class.getClassLoader().getResourceAsStream("db/config.properties");

        try
        {
            properties.load(is);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        width = Integer.parseInt(properties.getProperty("width"));
        height = Integer.parseInt(properties.getProperty("height"));
        title = properties.getProperty("title");
    }
}
