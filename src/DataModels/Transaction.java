package DataModels;
import java.util.Date;

import Indentifiers.*;

public interface Transaction {
	
	Date InitiatedAt;
	Date CompletedAt; 
	double Amount; 
	User Sender; 
	User Receiver; 
	Account SendingAccount; 
	Account ReceivingAccount; 
	String Notes; 
	UniqueIdentifier ID; 
	
	
	double getAmount(); 
	
	Date dateInitiatedAt(); 
	
	Date dateCompletedAt(); 
	
	Boolean Completed(); 
	
	User getSender(); 
	
	User getReceiver(); 
	
	String getNotes(); 
	
	String getTransactionID(); 
	
	boolean changeDateToBeCompletedBy(Date updatedDate); 
	
	boolean updateAmount(double updatedAmount); 
	
	void updateOperator(double toBeUpdated); 
	
	boolean changeReceiver(User newReceiver); 
	
	boolean updateSendingAccount(Account sendingAccount); 
	
	boolean updateReceivingAccount(Account receivingAccount); 
	
	void updateNotes(String update); 
	
	
}
