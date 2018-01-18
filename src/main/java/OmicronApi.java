import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OmicronApi {

	private static final Logger log = LogManager.getLogger("api");
	private static String _address;
	private static int _port;

	public OmicronApi(String address, int port) {
		this._address = address;
		this._port = port;
	}

	public String toString() {
		return _address + ":" + _port;
	}

}
