package configTest;

import controllers.ConfigMapper;
import mappers.PropertiesMapper;
import mappers.JacksonYamlMapper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ConfigurationTest {

    @Test
    public void testYamlFileMapper() {
        ConfigMapper mapper = new JacksonYamlMapper();
        Assert.assertEquals(mapper.getName(), "some name");
        Assert.assertEquals(mapper.getServerUrl(), "some url");
    }

    @Test
    public void testPropertiesFileMapper() {
        ConfigMapper mapper = new PropertiesMapper();
        Assert.assertEquals(mapper.getName(), "some name");
        Assert.assertEquals(mapper.getServerUrl(), "some url");
    }
}
