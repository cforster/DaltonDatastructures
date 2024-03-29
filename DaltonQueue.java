/*
Authors:
Charles Forster
Isabella Giovannini
Jason Shein
Katherine Odom
Malina Buturovic
Derek Whang -_- hohoho
Annelise Steele <3
Sophia Edelstein 
 */

public class DaltonQueue extends java.util.LinkedList
{
    /*
      Author: Malina
      Function: peek_all
      Parameters: none
      Returns: String with all elements in Queue
    */
    
    public String peek_all()
    {
	offer("end of array");
	String input="";

	while(!peek().toString().equals("end of array"))
	    {
		input = input + " " + this.peek();
		offer(poll());
	    }
	poll();
	return input;
    }
 



    /*
      Author: Sophia
      Function: length
    */
    public int length()
    {
	offer("end of array"); // puts in something to define the end of the array
	int length =0; // declares variable length =0
	
	while(!peek().toString().equals("end of array"))  // while loop
	    {
		offer(poll());
		length++;// increase length counter
	    }
	poll();
	return length; // returns length variable
    }
    
    

    /*                                                                          
       Author: ISABELLA (the brains) and malina (the moral support).
       function: replaces value at some place
       parameters: int value of what we want to replace, int we want to replace it with
       returns: void
       
     */

    void ReplaceAt(int toreplace, int rep)
    {
	offer("end of array"); //marks the end of the array
	int length = 0;
	//System.out.println("before the while");
	System.out.println(this.peek().toString());
	//System.out.println("after the peek");
	while(!peek().toString().equals("end of array")) //loops until end of array
	    {
		offer(poll()); 
		length++; //increase length counter
		if (toreplace==length)
		    {
			this.poll(); //removes the existing int at toreplace
			this.offer(rep); //puts in the new int
		    }
	    }
	poll();

    }



    /*
      Author: Isabella
     */
    void sort()
    {
	//make the queue into the array:
	Object[] queue = new Object[this.size()]; 
	int counter = 0;

	while (!this.isEmpty()) //go through the queue
	    {

		//System.out.println(this.poll());
		queue[counter++]= this.poll();
	    }

	//sort the array:
	java.util.Arrays.sort(queue);

	//return it to the queue:
	for (counter=0; counter<queue.length; counter++)
	    {
		this.offer(queue[counter]);
	   }
    }


    /*
      Author: Katherine
      Function: Dump (delete everything from the queue)
    */

    void dump()
    {	 while(!this.isEmpty())
	     {
		this.remove();
	     } 
    }
       
    /*
      Author: Shein
      Function: switch(x,y)
      parameters: x and y are both distances from the front of the queue
      return: nothing
    */
    void switchElem(int x, int y)
	{
	    java.util.Queue queue2 = new java.util.LinkedList();
	    java.util.Queue queue3 = new java.util.LinkedList();
	    int object1;

	    for(int i=0; i<x; i++)
		{
		    queue2.offer(this.poll());
		    
		}
	    
	    this.poll();
	}
}