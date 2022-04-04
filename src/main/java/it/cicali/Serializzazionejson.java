package it.cicali;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializzazionejson {
    public String SerializzaJson(root2 s) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
        System.out.println(json);
        return json;
      }
}
