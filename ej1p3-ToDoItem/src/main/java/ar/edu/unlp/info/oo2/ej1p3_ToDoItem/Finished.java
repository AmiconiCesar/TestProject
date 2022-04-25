package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;

import java.time.Duration;

public class Finished extends ToDoItemState {
	

    public Finished(ToDoItem toDoItem) {
		super(toDoItem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Duration workedTime() {
		return (Duration.between(this.toDoItem.getStartTime(), this.toDoItem.getFinishTime()));
		
	}
	
	@Override
	public void addComment(String comment) {
		
	}

	@Override
	public String currentState() {
		// TODO Auto-generated method stub
		return "Finished";
	}

}
