package properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {

        Properties properties = new Properties();

        try{
            InputStream inputStreamXml = new FileInputStream("src/properties/resources/application.xml");
            InputStream inputStream = new FileInputStream("src/properties/resources/application.properties");

            //properties.loadFromXML(inputStreamXml);
            properties.load(inputStream);

            System.out.println(properties);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
