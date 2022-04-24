package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
      private DatabaseAccess databaseReal;
      private String password;
      private boolean authenticated = false;
	
      
    public DatabaseProxyAccess(DatabaseAccess databaseReal, String password) {
    	this.databaseReal = databaseReal;
    	this.password = password;
    }
    
    public void login(String password) {
    	if (this.password.equals(password)) this.authenticated = true;
    	else this.authenticated = false;    
      }
    
          
	@Override
	public Collection<String> getSearchResults(String queryString) {
		 if (this.authenticated) 
			 return this.databaseReal.getSearchResults(queryString); 
		 return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.authenticated) 
			 return this.databaseReal.insertNewRow(rowData); 
		 return 0;
	}


}
