package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
  private static Properties properties=new Properties();

    static {


        InputStream inputStream=null;


        try {
            inputStream = new FileInputStream("configuration.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        //   properties.put("username","adam");
        //  properties.put("password","123");

        properties.put("url","https://cydeo.com");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getValue(String key){

        return  properties.getProperty(key);
    }
}
