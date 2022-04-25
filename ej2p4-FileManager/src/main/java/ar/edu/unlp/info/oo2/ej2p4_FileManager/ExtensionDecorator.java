package ar.edu.unlp.info.oo2.ej2p4_FileManager;

public class ExtensionDecorator extends FileDecorator{

	public ExtensionDecorator(FileComponent aFileComponent) {
		super(aFileComponent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		
		return this.wrappee.getExtension() + super.prettyPrint();
	}

}
