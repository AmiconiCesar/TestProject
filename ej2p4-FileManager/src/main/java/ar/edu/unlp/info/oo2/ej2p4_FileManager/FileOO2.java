package ar.edu.unlp.info.oo2.ej2p4_FileManager;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
	
	private String name;
	private String extension;
	private Double size;
	private LocalDate createdDate;
	private LocalDate modificationDate;
	private String permissions;
		
	

	public FileOO2(String name, String extension, Double size, LocalDate createdDate, LocalDate modificationDate,
			String permissions) {
		super();
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.createdDate = createdDate;
		this.modificationDate = modificationDate;
		this.permissions = permissions;
	}


	public String getName() {
		return name;
	}


	public String getExtension() {
		return extension;
	}


	public Double getSize() {
		return size;
	}


	public String prettyPrint() {
		return "";
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public LocalDate getModificationDate() {
		return modificationDate;
	}


	public String getPermissions() {
		return permissions;
	}
	
	
	

}
