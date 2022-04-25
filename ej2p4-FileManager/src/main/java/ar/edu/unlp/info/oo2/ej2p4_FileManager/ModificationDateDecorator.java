package ar.edu.unlp.info.oo2.ej2p4_FileManager;

public class ModificationDateDecorator extends FileDecorator{

	public ModificationDateDecorator(FileComponent aFileComponent) {
		super(aFileComponent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.wrappee.getModificationDate() + super.prettyPrint();
				}

}
