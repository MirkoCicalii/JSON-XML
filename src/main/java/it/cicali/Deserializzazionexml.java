package it.cicali;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Deserializzazionexml {
    public root2 DeserializzaXml() throws JsonParseException, JsonMappingException, IOException{
        File file = new File("src/main/java/it/cicali/resources/classe.xml");// si indica il percorso del file
        XmlMapper xmlMapper = new XmlMapper();
        root2 value = xmlMapper.readValue(file, root2.class);// file per non scrivere tutti le linee di codice,root può
        return value;
      }
}
