package ar.edu.unlp.info.oo2.ej2p4_FileManager;

public class CreatedDateDecorator extends FileDecorator {

	public CreatedDateDecorator(FileComponent aFileComponent) {
		super(aFileComponent);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return this.wrappee.getCreatedDate() + super.prettyPrint();
				}

}
