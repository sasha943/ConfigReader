package models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Server"
})
public class ServerProperties {

    @JsonProperty("Server")
    private Server server;

    @JsonProperty("Server")
    public Server getServer() {
        return server;
    }

    @JsonProperty("Server")
    public void setServer(Server server) {
        this.server = server;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "url"
    })
    public class Server {

        @JsonProperty("name")
        private String name;
        @JsonProperty("url")
        private String url;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }
    }

}

