package log4jEx.log4j_maven;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jMavenApplication {
	private static final Logger logger = LogManager.getLogger(Log4jMavenApplication .class);
	public static void main(String[] args) {
		SpringApplication.run(Log4jMavenApplication.class, args);  
//		// basic log4j configurator  
//		  BasicConfigurator.configure();  
//		  logger.info("Hello world");  
//		  logger.info("we are in logger info mode");  
		DOMConfigurator.configure("log4j.xml");  
        logger.debug("Sample debug message");  
        logger.info("Sample info message");  
        logger.warn("Sample warn message");  
        logger.error("Sample error message");  
        logger.fatal("Sample fatal message");  
		   
	}

}
