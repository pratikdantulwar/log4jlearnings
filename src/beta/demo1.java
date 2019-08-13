package beta;

import org.apache.logging.log4j.*;

public class demo1 {

	private static Logger log = LogManager.getLogger(demo1.class.getName());
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		log.info("object is present");
		log.error("object is not present");
		log.fatal("this is fatal");
		
	}

}
