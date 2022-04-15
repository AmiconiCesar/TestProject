package ar.edu.unlp.info.oo2.ej3p3_DeviceConnection;

public class Device {

	private Ringer ringer;
	private Display display;
	private CRC_Calculator crcCalculator;
	private Connection connection;

	public Device() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn();
	}

	public String send(String data) {
		int crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}

	public void changeConnection(Connection connection) {
		this.connection = connection;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}

	public void setCRC_Calculator(CRC_Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}

}
