package Ram;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UsingLog4J {
	static Logger log=Logger.getLogger(UsingLog4J.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Ram is Good boy");
		log.warn("its wrong");
		log.error("4th line has some error");
		log.fatal("9th line has a crictal error");
		log.debug("some mistake in program");
	}
}
			
			
			
			
	