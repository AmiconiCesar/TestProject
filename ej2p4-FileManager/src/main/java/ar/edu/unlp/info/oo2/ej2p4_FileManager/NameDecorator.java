package ar.edu.unlp.info.oo2.ej2p4_FileManager;

public class NameDecorator extends FileDecorator {

	public NameDecorator(FileComponent aFileComponent) {
		super(aFileComponent);
		
	}

	@Override
	public String prettyPrint() {
		    
		  return this.wrappee.getName() + super.prettyPrint();
	}

}
