package configTest;

import jackson.JacksonYamlMapper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ConfigurationTest {


    @Test
    public void test() {
        JacksonYamlMapper yamlMapper = new JacksonYamlMapper();
        Assert.assertEquals(yamlMapper.getName(), "some name");
        Assert.assertEquals(yamlMapper.getServerUrl(), "some url");
    }
}
