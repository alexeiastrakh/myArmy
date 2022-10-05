package com.solvd.Army.util;

import com.solvd.Army.Submarine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Jaxb {
    private static JAXBContext jaxbContext;
    private static Marshaller jaxbMarshaller;
    public void jaxbToXML(Submarine submarine){
        try {
            if(jaxbContext==null) {
                jaxbContext = JAXBContext.newInstance(Submarine.class);
            }
            if(jaxbMarshaller==null) {
                jaxbMarshaller = jaxbContext.createMarshaller();
            }

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(submarine, new File("src/main/resources/submarines.xml"));
        } catch (JAXBException e){
            e.printStackTrace();
        }
    }

}
