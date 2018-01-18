import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class App {
	
	private static final Logger log = LogManager.getLogger("main");

	public static void main(String[] args) {
		
		// Setup logging at info level
		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		Configuration config = ctx.getConfiguration();
		LoggerConfig loggerConfig = config.getLoggerConfig("main");
		loggerConfig.setLevel(Level.INFO);
		ctx.updateLoggers();
		
		// Create object for Omicron communications
		OmicronApi api = new OmicronApi("127.0.0.1", 5000);
		log.info("Interfacing with Omicron (" + api.toString() + ")");
		Logger root = LogManager.getRootLogger();
	}

}
