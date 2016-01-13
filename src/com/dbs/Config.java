package com.dbs;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
    public static Properties properties;
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
    }
}
