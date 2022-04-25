package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {

	private String name;
	private List<String> comments;
	private ToDoItemState state;
	private LocalDate startTime;
	private LocalDate finishTime;

	public ToDoItem(String name) {
		this.name = name;
		this.comments = new ArrayList<>();
		this.state = new Pending(this);

	}

	public void start() {
		this.state.start();
	}

	void startTime() {
		this.startTime = LocalDate.now();
		this.state = new InProgress(this);
	}
	
	void finishTime() {
		this.finishTime = LocalDate.now();
		this.state = new Finished(this);
	}
	

	public void togglePause() {
		this.state.togglePause();
	}

	public void finish() {
		this.state.finish();
	}

	public Duration workedTime() {
		return this.state.workedTime();

	}

	public void addComment(String comment) {
		this.state.addComment(comment);
	}

	void addComentary(String comment) {
		this.comments.add(comment);
	}
	
	
	void setState(ToDoItemState state) {
		this.state = state;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	
	public LocalDate getFinishTime() {
		return finishTime;
	}

	
	public String currentState() {
		return this.state.currentState();
	}

	public String getName() {
		return name;
	}
}
