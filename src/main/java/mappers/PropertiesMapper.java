package mappers;

import controllers.ConfigMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertiesMapper implements ConfigMapper {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesMapper.class);

    private Properties properties;

    public PropertiesMapper() {
        this.properties = getProperties();
    }

    private Properties getProperties() {
        URL url = getClass().getClassLoader().getResource("application.properties");
        Properties properties = new Properties();
        try {
            LOG.warn("Load properties file by url: {}", url.getPath());
            properties.load(new FileInputStream(url.getFile()));
        } catch (IOException e) {
            LOG.warn("Can not load file by url: {}", url.getPath());
        }

        return properties;
    }

    public String getName(){
        return properties.getProperty("name");
    }

    public String getServerUrl(){
        return properties.getProperty("url");
    }
}
