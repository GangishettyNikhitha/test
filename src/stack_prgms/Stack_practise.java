package stack_prgms;

import java.util.Stack;

public class Stack_practise 
{
	public static void main(String[] args) 
	{
// 		stack introduced in the version of jdk 1.0 i.e, this is also a legacy class
//		that means this is intoduced before collection inteface 
//		as we know vector is also a legacy class
		
		
	/*  stack extends vector i.e,stack has all the properties of the vector
	    stack initial capacity is 10 and auto global is also same like vector i.e,it increase the size of an array by double of its previous capacity
		imagine vector array as horizontal and stack array as vertical,simply we can say that by rotating anti clockwise of a vector it becomes stack
		i.e,in vector at the top position the index value is 0 and bottom index value is the last value of an array    (eg:if an array contains 10 elements then index value at top  is 0 and at bottom index value is 9)
		but in stack at the bottom position the index value is 0 and at top index value is the last value of an array  (eg: if an array contains 10 elements then index value at top is 9 and at bottom index value is 0)
		 
	*/
		
	/*	LIFO - Last in first out  - stack
		FIFO - First in first out  - Queue
		Stack is a class in java which implements the list interface and extends the vector class and also represents the LIFO principal
	*/
// 		while creating a stack we should only create an empty stack i.e,by default we should not give any size to the stack
//		this is the main difference i.e, in vector by default we can create a vector by assigning the initial capacity as 10 or 20
//		but this can't be done in stack .here we can only call through the parametrised constructor(constructor with argument)
//		we can not create a stack with intial capacity or we cannot create a stack with list of elements
//		we can only create a empty stack
		
		
		

	Stack<String>  books = new Stack<>();
	books.add("Red");
	books.add("Black");
	books.add("White");
	System.out.println(books);
	
	//remove or deletion of a element
//	books.remove("Red");
//	System.out.println(books);
	
	//updation of a element
//	books.set(0, "Yellow");
//	System.out.println(books);
	
	//Retriving of an element
//	System.out.println(books.get(1));
	
	//Contains
//	System.out.println(books.contains("white"));
	
	//Clearing the list
//	books.clear();
//	System.out.println(books);
	
	/*Special methods available in stack:
	 * 1)push	(adding an element into an array)
	 * 2)pop	(Removing an element which is present at bottom or last)
	 * 3)peek	(used to see the which element present at last(i.e,at bottom(index is 0))
	 * 4)search (it will search from top of the array so now in this method top value is 1 but actual index value of a top element is 9)
	 * 			(e.g: [white,black,red] here red index value is 0 ,black index value is 1,and white index value :  2 ,while searching the white value bcms 1 ,black value bcms 2 and red value bcms 3)
	 * 			(suppose now if we want to search red then it returns 3)
	 * 			(that means search operations start from top to bottom)
	 */
	
	System.out.println(books.peek()); // it returns the last added value
	System.out.println(books);
	
	System.out.println("search value of red is : "+books.search("Red")); //it will start searching from green with the value 1 so at the bottom of array red is present so the value of red is 3
	System.out.println("search value of white is : "+books.search("White"));
	System.out.println("index value of white is : "+books.indexOf("White"));
	
	System.out.println(books.pop()); // removes the last element
	System.out.println(books);
	
	books.push("Green");   // act like add() method i.e, in place of add() we can also write push()
	System.out.println(books);
	
	System.out.println(books.isEmpty()); 
	System.out.println(books.empty());	//same as isEmpty()
	//Thus proves that isEmpty() is also same like empty()
	
	}
}
/*		Default capacity and initial capacity of stack is 10
	*	allow duplicate values,null values,maintain insertion order ,doesn't maintain sorted order
*	it offer random access of elements but we should not use random access bcz we should use stack as stack only i.e, we should use only 4 methods(push,pop,peek,search)
	if we use get(),set(),sort(),clear(),isEmpty()...so on in stack then we are using stack as list or vector 
	so there is no point to use 
*	AS we know vector is synchronised abviously stack is also a synchronised
*	It is good at Last in first out
*	Applications of stack are : 
		when we are using microsoft word then we use undo(changing into last change) and redo (changing into  previous change) applications
		in browser we use back and forward applications
		related to recurssion 
		and related to open brackets and close brackets
*	for all these applications we use stack 
*	LIFO based applications are the best examples for stack
		
		 
	
*/
