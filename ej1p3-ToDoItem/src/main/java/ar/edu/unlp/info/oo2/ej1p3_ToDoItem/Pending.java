package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;

import java.time.Duration;

public class Pending extends ToDoItemState{
	
   

	public Pending(ToDoItem toDoItem) {
		super(toDoItem);
			}

	@Override   
	public void start() {
    	 this.toDoItem.startTime();
		}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem todavia no está Iniciado");
	}

	@Override
	public String currentState() {
		return "Pending";
	}
	
}
	
	