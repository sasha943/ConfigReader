package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import models.ServerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

public class JacksonYamlMapper {

    private static final Logger LOG = LoggerFactory.getLogger(JacksonYamlMapper.class);

    private ServerProperties serverProperties;

    public JacksonYamlMapper() {
        this.serverProperties = getServerProperties();
    }

    private ServerProperties getServerProperties(){
        LOG.info("Get server properties");
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ServerProperties serverProperties = null;
        try {
            URL url = getClass().getClassLoader().getResource("application.yaml");
            LOG.info("Url to file is: {}", url);
            File yamlFile = new File(url.getPath());
            serverProperties = mapper.readValue(yamlFile, ServerProperties.class);
        } catch (Exception e) {
            LOG.warn("can not map file to object: {}", e.getMessage());
        }
        return serverProperties;
    }

    public String getName(){
        return serverProperties.getServer().getName();
    }

    public String getServerUrl(){
        return serverProperties.getServer().getUrl();
    }
}
