package ar.edu.unlp.info.oo2.ej3p3_DeviceConnection;

public class Connection4G {

	private String symb = "4G";

	public String symb() {
		return symb;
	}

	public String transmit(String data, int crc) {
		return "Se envio el mensaje "+ data + " via 4G";

	}

}
