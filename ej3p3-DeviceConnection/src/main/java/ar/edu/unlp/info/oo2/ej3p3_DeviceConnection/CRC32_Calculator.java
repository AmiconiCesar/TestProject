package ar.edu.unlp.info.oo2.ej3p3_DeviceConnection;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{

	@Override
	public int crcFor(String data) {
			CRC32 crc = new CRC32();
			String datos = data;
			crc.update(datos.getBytes());
			long result = crc.getValue();
			return (int) result;
	}
}
