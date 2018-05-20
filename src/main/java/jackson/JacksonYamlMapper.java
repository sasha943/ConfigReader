package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import models.ServerProperties;

import java.io.File;

public class JacksonYamlMapper {

    private ServerProperties serverProperties;

    public JacksonYamlMapper() {
        this.serverProperties = getServerProperties();
    }

    private ServerProperties getServerProperties(){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ServerProperties serverProperties = null;
        try {
            File yamlFile = new File("/home/ubuntu/IdeaProjects/ConfigReader/src/main/resources/application.yaml");
            serverProperties = mapper.readValue(yamlFile, ServerProperties.class);
        } catch (Exception e) {
            e.printStackTrace();
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
