package ar.edu.unlp.info.oo2.ej2p4_FileManager;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		
	    LocalDate fechaC = LocalDate.of(2022, 3, 4);
	    
	    LocalDate fechaM = LocalDate.of(2022, 4, 8);
		
		FileComponent file1 = new FileOO2("miarchivo", ".txt", 550.0, fechaC, fechaM, "Escritura/Lectura");
	        
	    
	    FileComponent prueba1 = new SizeDecorator 
	    		                (new ModificationDateDecorator 
	    		                (new NameDecorator
	    		                (new CreatedDateDecorator	
	    		                (new PermissionsDecorator		
	    		               	(new ExtensionDecorator(file1))))));	    
	    
	    
	    
	    System.out.println(prueba1.prettyPrint());
		
		
		

	}

}
