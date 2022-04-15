package ar.edu.unlp.info.oo2.ej3p3_DeviceConnection;

public class WifiConn implements Connection {
	
	private String pict = "WiFi";

	@Override
	public String sendData(String data, int crc) {
		// TODO Auto-generated method stub
		return "Se envio el mensaje "+ data + " via WiFi";
	}

	@Override
	public String pict() {
		// TODO Auto-generated method stub
		return this.pict;
	}
	

}
