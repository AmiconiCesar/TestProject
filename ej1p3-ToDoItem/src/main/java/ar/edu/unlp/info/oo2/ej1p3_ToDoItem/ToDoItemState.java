package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;

public abstract class ToDoItemState {
	
	protected ToDoItem toDoItem;
	
	public ToDoItemState(ToDoItem toDoItem) {
		this.toDoItem = toDoItem;
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en Paused o In-Progress");
	}
	
	public void finish() {
		
	}
	
	public Duration workedTime() {
		return (Duration.between(this.toDoItem.getStartTime(), LocalDate.now()));
		
	}
	
	public void addComment(String comment) {
		this.toDoItem.addComentary(comment);
	}

	public abstract String currentState();
		
	}


