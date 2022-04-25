package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;




public class Paused extends ToDoItemState {
	

    public Paused(ToDoItem toDoItem) {
		super(toDoItem);
		}

	@Override
	public void togglePause() {
		this.toDoItem.setState(new InProgress(toDoItem));
	}
	
    @Override
	public void finish() {
		this.toDoItem.finishTime();
	}

	@Override
	public String currentState() {
		// TODO Auto-generated method stub
		return "Paused";
	}
	
   
	

}
