package Logi.Logging;


import org.apache.logging.log4j.*;

public class Logprac {
	
	private static Logger log =LogManager.getLogger(Logprac.class.getName());

	public static void main(String[] args) {
		
		log.debug("debug value");
		log.error("error value");
		log.fatal("fatal value");
		

	}

}
