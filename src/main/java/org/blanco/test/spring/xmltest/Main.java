package org.blanco.test.spring.xmltest;


import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;

public class Main {

  
  public static void main(String args[]) throws XmlMappingException, IOException{
    ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-config.xml");
    Marshaller mar = (Marshaller) ctx.getBean("marshaller");
    Person alex = (Person) ctx.getBean("alex");
    Result result = new StreamResult(System.out);
    mar.marshal(alex, result);
    
    System.exit(0);
  }
  
}
