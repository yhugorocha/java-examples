package properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class StoreProperties {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("spring.aplication.name", "Hugo");
        properties.put("spring.aplication.lastName", "Silva");
        properties.put("spring.aplication.age", "25");

        try{
            //Exportando propriedades a .xml
            /*OutputStream outputStreamXML = new FileOutputStream("src/properties/resources/application.xml");
            properties.storeToXML(outputStreamXML, "Algum comentario para meu properties");*/

            //Exportando propriedades .properties
            OutputStream outputStreamXML = new FileOutputStream("src/properties/resources/application.properties");
            properties.store(outputStreamXML, "Algum comentario para meu properties");

        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
