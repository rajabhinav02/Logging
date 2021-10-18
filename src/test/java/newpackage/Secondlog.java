package newpackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Secondlog {

	private static Logger log = LogManager.getLogger(Secondlog.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("2nd package debug");
		log.error("3rd package debug");
	}

}
