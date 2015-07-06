package DataModels;

import java.util.ArrayList;

import Indentifiers.UniqueUserIdentifier;

public interface User {

	UniqueUserIdentifier ID; 
	String UserName; 
	int Age; 
	String Address; 
	ArrayList<Account> AssociatedAccounts;
	String NationalID; 
	Account primaryAccount; 
	int PhoneNumber; 
	UserInbox myPayments;  
	
	
	
	boolean sendTo(User user, Account account); 
	
	boolean requestFrom(User user, Account account); 

	boolean sendToUsersPrimaryAccount(ArrayList<User> recepients); 
	
	boolean approveRequest( Transaction someTransaction); 
	
	void destroy(); 
	
}
