package com.mobile.testing.database.connection;

import com.mobile.testing.utils.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class DatabaseConnection {
    static Connection instance;
    public static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtil.class);

    public static Connection getConnection() {
        if(instance == null){
            try {
                Properties prop = PropertiesUtil.getProps(System.getProperty("testDatabaseProperties"));
                LOGGER.info("Connecting " + prop.getProperty("url"));
                instance = DriverManager.getConnection(prop.getProperty("url") , prop);
                if (instance!= null) {
                    LOGGER.info("Connection created successfully") ;

                }else{
                    LOGGER.warn("Problem with creating connection"); ;
                }
            }  catch (Exception e) {
                LOGGER.error("Problem creating connection to database") ;
                e.printStackTrace(System.out) ;
            }
        }
        return instance;
    }
}
