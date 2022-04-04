package it.cicali;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserializzazionejson {
    
    public root DeserializzajSON() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        File filejson =new File("src/main/java/it/cicali/resources/puntiVendita.json");
        root valore =mapper.readValue(filejson, root.class);
        System.out.println(valore);
        return valore;

      }
}
