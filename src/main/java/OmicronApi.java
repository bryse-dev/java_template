public class OmicronApi {

	private static String address;
	private static int port;
	
	public OmicronApi(String address, int port) {
		this.address = address;
		this.port = port;
	}
	
	public String toString() {
		return address + ":" + port;
	}
	
}
