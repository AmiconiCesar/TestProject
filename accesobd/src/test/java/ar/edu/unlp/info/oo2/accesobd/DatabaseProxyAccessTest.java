package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyAccessTest {
	 private DatabaseAccess database;
	 private DatabaseProxyAccess databaseProxy;
	 private String password;

	    @BeforeEach
	    void setUp() throws Exception {
	        this.database = new DatabaseRealAccess();
	        this.password = "p346nfg";
	        this.databaseProxy = new DatabaseProxyAccess(database, password);
	    }

	    @Test
	    void testNotLogin() {
	        assertNull(this.databaseProxy.getSearchResults("select * from comics where id=1"));
	        assertEquals(0, this.databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	    }

	    @Test
	    void testLoginDenied() {
	    	this.databaseProxy.login("zzzz787");
	    	assertNull(this.databaseProxy.getSearchResults("select * from comics where id=1"));
	        assertEquals(0, this.databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	    }
	    
	    @Test
	    void testLoginAdmitted() {
	    	this.databaseProxy.login("p346nfg");
	    	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseProxy.getSearchResults("select * from comics where id=1"));
	        assertEquals(Collections.emptyList(), this.databaseProxy.getSearchResults("select * from comics where id=10"));
	    	assertEquals(3, this.databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.databaseProxy.getSearchResults("select * from comics where id=3"));
	    }	
	    
	    
	
}
