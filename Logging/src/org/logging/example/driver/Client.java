package org.logging.example.driver;

import org.apache.log4j.Logger;
import org.logging.example.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
	static Logger logger=Logger.getLogger(Client.class.getName());
   public static void main(String[] args) {
      ApplicationContext ap=
    		  new ClassPathXmlApplicationContext("org/logging/example/xmls/logger.spring.xml");
      logger.info("creating hellow world object");
      HelloWorld hel=(HelloWorld) ap.getBean("hel1");
      hel.display();
      logger.info("executed sucessfully.. exiting the app");
      logger.info("============================================================");
      
}
}
