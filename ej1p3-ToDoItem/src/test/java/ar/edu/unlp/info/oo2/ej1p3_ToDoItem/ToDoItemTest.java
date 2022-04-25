package ar.edu.unlp.info.oo2.ej1p3_ToDoItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemTest {
	
	private ToDoItem item;
	
	
	 @BeforeEach
	    void setUp() throws Exception {
		 
		 	item = new ToDoItem("Prueba");

	 }
	 
	 @Test
	 	void constructorTest() {
		 	assertEquals("Prueba", item.getName());
		 	assertEquals("Pending", item.currentState());
		 		 }
	 
	 @Test
	 	void startTest() {
		 	//Estando en estado Pending
		  	item.start();
		 	assertEquals("InProgress", item.currentState());
		 	//Estando en otro estado
		 	item.start();
		 	assertEquals("InProgress", item.currentState());
	 }
	 @Test
	 	void togglePausseTest() {
		     //Estando en estado Pending
		     item.togglePause();
		     assertEquals("Pending", item.currentState());
		     //Estando en estado InProgress
		     item.start();
		     item.togglePause();
		     assertEquals("Paused", item.currentState());
		     //Estando en estado Paused
		     item.togglePause();
		     assertEquals("InProgress", item.currentState());
		     
	 }
	 
	 
	 
	 
	 
}
