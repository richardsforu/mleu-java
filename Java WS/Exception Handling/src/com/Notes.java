package com;

public class Notes {
	/*
	 * Exception Handling
	 * ----------------------
	 * 
	 *  -> A sudden breakdown of an application
	 *  -> also known as abnormal program termination
	 *  
	 *  
	 *   -> To make sure few statements ae executing even there is an abnormal termination, then we should handle the exception
	 *   
	 *   Types of Exceptions
	 *   ---------------------
	 *   1. Checked Exceptions -> Compile time
	 *   2. Unchecked Exceptions -> Runtime 
	 *   
	 *   Further divided into two types
	 *   ------------------------------
	 *   1. Built In Exceptions
	 *   2. User Defined Exceptions
	 *   
	 *   
	 *   How to Handle Exceptions
	 *   ------------------------
	 *   
	 *   -> try block
	 *   -> catch block
	 *   -> finally block
	 *   
	 *   Notes
	 *   ---------
	 *   1. try block must be provided for handling any exception
	 *   2. try block must be defined by following catch or finally block
	 *   3. catch block is optional if there is a finally block is defined after try block
	 *   4. finally block is optionla if there is a catch block defined after try block
	 *   5. we can even provide finally block after catch block is defined.
	 *   6. with out either catch or finally, try block can not be defined
	 *   
	 *   7. We usually defines business logic in the try block
	 *   8. if all the statements in the try block is executed, then catch block gets skipped
	 *   9. If any statement in the try block gives excveption, then immediayky catch block gets executed
	 *   10. finally block always gets executed, even execition raised or not.
	 *   
	 *   
	 *   Exceptions class levels
	 *   --------------------------
	 *   
	 *   										java.lang.Throwable
	 *   					
	 *   					Error											Exception
	 *   
	 *   													IOExcption								RuntimeException
	 *   
	 *   							all the sub classes of IOExveption is checked exceptions. All the sub classes of Runtime execption is Un checked exception
	 *   
	 *   
	 *   
	 *   
	 * 
	 * 
	 */

}
