
import java.util.ArrayList;

/*
   This is the Dalton Stack assignment for the CSA class

   Authors:
   Xander Chase
   Charles Forster
   Jeffrey Stern
   Emily Lovett
   Jeffrey Stern
   Taylor Wright
   Harry DiPirinzio
   Josh Kaye
   Alex Mayer
   Maya Klabin
   Michael Dubin
   Michael Zhao


   /*delete all(Xander), substack(jeff, alex), convert(), delete one(michael, josh), reverse (taylor, harry), frequency(emily), length/size (maya), randomize(maya/dubin)*/



/*
  DONE:
  - Length
  - Reverse
  - Clear All
  -Convert
*/




    public class DaltonStack extends java.util.Stack
    {
	/*
	  Function: subStack
	  Description: takes a portion (from i to j) of the original stack
	               and returns that portion
	  Author: Jeffrey Stern
	 */
	public DaltonStack subStack (int i, int j)
	{
	    DaltonStack topstack = new DaltonStack(); //creates a top stack
	    DaltonStack substack = new DaltonStack(); //creates the sub stack
	    
	    //get the topstack off the mainstack:
	    for(int x=0; x<i; x++)
		{
		    topstack.push(this.pop());
		}

	    //creates the substack from i to j:
	    for (int c=i; c<=j; c++)
		{
		    substack.push(this.pop());
		}
	    
	    substack.reverse();
	   
	    //puts the topstack back into the original stack:
	    while(!topstack.isEmpty())
		{
		    this.push(topstack.pop());
		}
	    return substack;
	    
	}//subStack


	/*																				  Function: reveress the order of the stack                                                                                                                  
																				  Description: reverses the order of the stack                                                           
																				  Author: Harry DiPrinizio & Taylor Wright                                                                                                                     
																				  Output: A stack w/ the contents reversed                                                                                       
																				  Input: a Stack                                                                                                                                               
	*/
    public void reverse()
    {
	java.util.Queue<Object> myQueue = new java.util.LinkedList<Object>();

	//pop the stack into a queue (until it is empty):
	while(!this.isEmpty())
	    {
		myQueue.add(this.pop());
	    }

	//get the queue into the stack

	while(! myQueue.isEmpty())
	    {
		this.push(myQueue.remove());
	    }

    }

    /*
      Function: converts the Stack to a Queue
      Description: Makes it so that the last item into the stack will be the first item out of the queue.
      Author: Harry DiPrinizio & Taylor Wright
      Output: a Queue w/ the contents of the stack
      Input: a Stack 
    */
    public void  convert()
    {
	java.util.Queue<Object> myQueue = new java.util.LinkedList<Object>();

        //pop the stack into a queue (until it is empty):                                                                                                     
        while(!this.isEmpty())
            {
                myQueue.add(this.pop());
            }

    }


    /*
      Function: deleteTop
      description:  pops the top item and doesn't return it.
      Author: Charlie Forster
      Input: nothing
      Output: nothing
      Notes: This is an example from charlie
    */
    public void deleteTop()
    {
	this.pop();
    }

    /* Function: shows length of stack
       Description: Pops everything out of the stack onto a new stack, counting the items, and returns them to the original stack
       Author: Maya Klabin
       Input: Nothing 
       Output: The number of items in the stack
       Notes: 
    */
    public int length()
    {
	return this.size();
    }//length

    /*
 

    /*
      Fuction: Randomize
      Description: Changes the order of the items in the stack randomly
      Author: Maya Klabin and Michael Dubin
      Input: Nothing
      Output: Nothing
    */
    public void randomize()
    {
 	ArrayList list = new ArrayList();
	
	while (length() > 0)
	    {
		list.add(this.pop());	    
	    }//converts the stack into the arraylist

	java.util.Collections.shuffle(list);//randomizes the arraylist
	
	while (!list.isEmpty())
	    {
		this.push(list.get(0));
		list.remove(0);
	    }//converts the randomized arraylist into a stack 
    
    }//randomize


    public void clearAll()
    {
	int x = 0;
	while (x<this.size())
	    {
		this.pop();
		x++;
	    }//ends while
    }//ends clear all
    /*
      Function: DelOne
      description: Deletes an item from anywhere in the stack & replaces all that were above it
      Authors: Josh Kaye and Michael Zhao
      Input: Desired item to delete
      Output: none
      Notes: none
    */
    public void deleteOne(Object blah)
    {//method

	java.util.Stack popped = new java.util.Stack();
    
	for (int i=0; i<this.size(); i++)
	    {//for
		if (this.peek()!=blah)
		    {//if
			popped.push(this.pop());
			this.pop();
		    }//if
		else 
		    {//else
			this.pop();
			for (int j=0; j<popped.size(); j++)
			    {//for
				this.push(popped.size()-j);
				popped.pop();

			    }//for
		    }//else
	    }//for

    }//method

	/**
	Authors: Emily and Alex
	Input: Object number (user is searching for its frequency)
	Output: int counter (# of times number appears)
	Purpose: Find the frequency of number
	**/

    int frequency(Object number)
    {
	Object[] original_array = new Object[this.size()]; //new array that allows us to search through the data
	int counter = 0; //incrementer
	int temp_array = this.size(); //size of the stack, need it to stay constant

	while(this.isEmpty() == false) //this pops everything in the stack and puts it in our new array
	    {
		for (int i = 0; i < temp_array; i++)
		    {
			original_array[i] = this.pop();
		    }//while

	    }//while

	for (int x = 0; x<original_array.length; x++) //goes through the new array and counts the frequency, incrementing buddha
	    {
		if(original_array[x]==number) counter++;
		   
	    }//for

	for (int j = temp_array-1; j >= 0; j--) //pushes everything back into the stack in original order
	    {
		this.push(original_array[j]);
	    }//for

	return counter;

    }//frequency



}//class


