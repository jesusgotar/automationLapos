package com.mobile.testing.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesUtil {
    static FileInputStream inputStream;
    public static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtil.class);


    public static Properties getProps(String propFileName) throws IOException {
        Properties prop = new Properties();

        try {
            inputStream = new FileInputStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            LOGGER.error("Exception: " + e);
        } finally {
            inputStream.close();
        }
        LOGGER.info("Properties Loaded successfully!");
        return prop;
    }
}