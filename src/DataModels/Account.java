package DataModels;

import java.util.ArrayList;

import Indentifiers.UniqueIdentifier;


public interface Account {

	UniqueIdentifier ID; 
	ArrayList<User> AssociatedUsers; 
	Double Balance; 
	 
	
	
	boolean removeUser(User someUser); 
	
	boolean removeAllUsers(ArrayList<User> SomeUsers); 
	
	boolean addToBalance(double updateAmount); 
	
	boolean deductFromBalance(double updateAmount); 
	
	
	void destroy(); 
	
	
	
}
