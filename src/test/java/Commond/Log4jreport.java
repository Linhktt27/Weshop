package Commond;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jreport {
	  static Logger log = LogManager.getLogger(Log4jreport.class);
	     
	    public static void main(String[] args)
	    {
	    	PropertyConfigurator.configure("D:\\workspace\\Weshop\\src\\main\\java\\resources\\log4j.properties");
	    	 log.debug("Sample debug message");
	         log.info("Sample info message");
	         log.error("Sample error message");
	         log.fatal("Sample fatal message");

	    }
}
