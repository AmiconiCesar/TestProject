package ar.edu.unlp.info.oo2.ej2p4_FileManager;

import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {
	
	
	protected FileComponent wrappee;
	
	
	public FileDecorator(FileComponent aFileComponent) {
		  this.wrappee = aFileComponent;
	}
	
	public String prettyPrint() {
		  if (!this.wrappee.prettyPrint().isEmpty())
		
		        return " - " + this.wrappee.prettyPrint();
		   return "";}
	

	public String getName() {
		return this.wrappee.getName();
	}


	public String getExtension() {
		return this.wrappee.getExtension();
	}


	public Double getSize() {
		return this.wrappee.getSize();
	}

    public LocalDate getCreatedDate() {
    	return this.wrappee.getCreatedDate();
    }

    public LocalDate getModificationDate() {
    	return this.wrappee.getModificationDate();
    }
    
    public String getPermissions() {
    	return this.wrappee.getPermissions();
    }
    
    
}
