import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerProperty {
	public static final Logger logger=Logger.getLogger(LoggerProperty.class);
	public static final String loggerFile="log4j.properties";
	public static void main(String[] args)
	{
       new LoggerProperty();
       //sample info log message
       logger.info("leaving the main method of LoggerAProperty");
       
	}
	public LoggerProperty()
	{
		initializeLogger();
		//sample info log message
		logger.info("leaving the LoggerProperty constructor");
		
	}
	private void initializeLogger()
	{
		Properties logProperties=new Properties();
		try
		{
			//load log4j properties configuration file 
			logProperties.load(new FileInputStream(loggerFile));
			PropertyConfigurator.configure(logProperties);
			logger.info("logging initialized");
		}
		catch (IOException e) {
			logger.error("unable to load logging property",e);
		}
		
		try
		{
			FileInputStream fstream=
					new FileInputStream("C:\\abhi\\Loggers\\LoggerProperties\\mytext.txt");
			DataInputStream in=new DataInputStream(fstream);
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String strLine;
			while((strLine = br.readLine()) != null)
			{
				System.out.println(strLine);
				in.close();
			}
		}
		catch (FileNotFoundException fe) {
			logger.error("File Not Found",fe);
			logger.warn("this is a warning message",fe);
			logger.trace("this message will not be logged,"
					+ " since log level is set to DEBUG");
		}
		catch (IOException e) {
			logger.error("IOException occured",e);
		}
	}

}
