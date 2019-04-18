package com.logger.example.Beans;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;

public class LoggerDemo
{
	public static Logger log=Logger.getLogger(LoggerDemo.class);
	public static void main(String[] args)
	{
		Appender apnd;
       log.debug("this is a debug message");
       log.info("this is an info message");
	}

}
