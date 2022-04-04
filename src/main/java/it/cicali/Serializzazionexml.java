package it.cicali;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Serializzazionexml {
    public String serializzaXml(root d) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(d);
        System.out.println(xml);
        return xml;
      }
}
