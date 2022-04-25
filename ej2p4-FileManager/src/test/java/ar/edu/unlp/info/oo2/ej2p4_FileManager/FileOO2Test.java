package ar.edu.unlp.info.oo2.ej2p4_FileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FileOO2Test {
	 private FileComponent file, fileDecorator1, fileDecorator2, fileDecorator3;
	 
    @BeforeEach
    void setUp() throws Exception {
    	 LocalDate fechaC = LocalDate.of(2022, 3, 4);
 	    
 	    LocalDate fechaM = LocalDate.of(2022, 4, 8);
 		
 		this.file = new FileOO2("miarchivo", ".txt", 550.0, fechaC, fechaM, "R/W");
 	        
 	    
 	    this.fileDecorator1 = new NameDecorator
 	    		             (new ExtensionDecorator(this.file));	    
    	
 	    this.fileDecorator2 = new NameDecorator
                			 (new ExtensionDecorator
                		     (new CreatedDateDecorator(this.file)));
 	   
 	    this.fileDecorator3 = new PermissionsDecorator
 	    				     (new NameDecorator 
 	    		             (new ExtensionDecorator
 	    				  	 (new SizeDecorator(this.file))));
 	    
 	    
    }

    @Test
    void testPrettyPrint() {
        assertEquals("miarchivo - .txt", this.fileDecorator1.prettyPrint());
        assertEquals("miarchivo - .txt - 2022-03-04", this.fileDecorator2.prettyPrint());
        assertEquals("R/W - miarchivo - .txt - 550.0", this.fileDecorator3.prettyPrint());
    
    }

}
