package ar.edu.unlp.info.oo2.ej2p4_FileManager;

import java.time.LocalDate;

public interface FileComponent {

	
	
	public String prettyPrint();
	
	public String getName(); 
		
	public String getExtension(); 
	
	public Double getSize(); 
	
	public String getPermissions();
	
	public LocalDate getCreatedDate();
	
	public LocalDate getModificationDate();
		
	
	
}
