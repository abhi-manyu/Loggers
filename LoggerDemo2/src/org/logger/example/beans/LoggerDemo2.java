package org.logger.example.beans;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class LoggerDemo2
{
	public static Logger log=Logger.getLogger(LoggerDemo2.class);
   public static void main(String[] args) throws IOException
    {
	   BasicConfigurator.configure();
	   log.debug("this is a debug message");
	   log.info("this is a info message");
	   log.warn("be careful, this is a warnning message ");
   }
}
