package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;




public class InProgress extends ToDoItemState {
	
    public InProgress(ToDoItem toDoItem) {
		super(toDoItem);
    }
    
	@Override
	public void togglePause() {
		this.toDoItem.setState(new Paused(toDoItem));
	}
	
    @Override
	public void finish() {
    	 this.toDoItem.finishTime();
	}

	@Override
	public String currentState() {
		// TODO Auto-generated method stub
		return "InProgress";
	}
	

}
