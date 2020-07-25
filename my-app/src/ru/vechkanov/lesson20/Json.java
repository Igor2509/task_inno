package ru.vechkanov.lesson20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Json {
    public void run(String url) throws IOException {
        URL jsonUrl = new URL(String.format("http://ip-api.com/json/%s", url));
        ObjectMapper mapper = new ObjectMapper();
        Response response=mapper.readValue(jsonUrl, Response.class);
        System.out.println(response.toString());
    }
}
