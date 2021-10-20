package invideo.api.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class DataLoader {
    private final Properties properties;
    private static DataLoader dataLoader;

    private DataLoader(){
        properties = PropertyUtils.propertyLoader("src/test/resources/data.properties");
    }

    public static DataLoader getInstance(){
        if(dataLoader == null){
            dataLoader = new DataLoader();
        }
        return dataLoader;
    }

    public void setToken(String token) throws IOException {
        properties.setProperty("token", token);
        properties.store(new FileOutputStream("src/test/resources/data.properties"), null);
        //else throw new RuntimeException("property token is not specified in the data.properties file");
    }
    public String getToken(){
        String prop = properties.getProperty("token");
        if(prop != null) return prop;
        else throw new RuntimeException("property token is not specified in the data.properties file");
    }

    public String getUpdatePlaylistId(){
        String prop = properties.getProperty("update_playlist_id");
        if(prop != null) return prop;
        else throw new RuntimeException("property update_playlist_id is not specified in the data.properties file");
    }
}
