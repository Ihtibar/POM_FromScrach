package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
    static Properties po;
    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");

            po = new Properties();

            po.load(file);

            file.close();
        } catch (Exception e){

        }

    }

    public static String getinfo(String ss){
        return po.getProperty(ss);
    }




}




