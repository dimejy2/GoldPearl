package DataModels;

import java.util.Stack;

public interface UserInbox {

	Stack<Transaction> Payments;
	
	Transaction nextTransaction(); 
	
	boolean removeTransaction(); 
	
	
	
}
