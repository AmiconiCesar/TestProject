package ar.edu.unlp.info.oo2.ej3p3_DeviceConnection;

public class Adapter4G implements Connection{
	
	private Connection4G connection4G;
	
	
	
	@Override
	public String sendData(String data, int crc) {
		return this.connection4G.transmit(data, crc);
		
	}
	
	@Override
	public String pict() {
		return this.connection4G.symb();
	}

}
