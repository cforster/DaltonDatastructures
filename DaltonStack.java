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
      takes a portion (from i to j) of the original Stack

    */
    //SUBSTRING FOR THE MYSTRING PROGRAM (NOT STACK)
    /* public DaltonStack  subStack(int i, int j)
       {
       int [] substack = new int [j-i+1];//new substrings length
       if (i<j)
       {
       for (int c=i; c<=j; c++)
       {
       substack [c-i]=m[c];
       }
       }
       return new DaltonStack (substack);
    */
    /*create a top stack, create the substack (it would be backward-->need to reverse) put the removed items back on the original stack, return the substack.
     */
    //}
    /*                                                                                                                                                            
																				   Function: reveress the order of the stack                                                                                                                  
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
    */
    public int length()
    {
	return this.size();
    }//length

    /*
      Function: ClearAll
      Description: Clears the Stack
      Author: Xander Chase
      Input:Nothing 
      Output:Nothing
    */



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
	Output: int buddha (# of times number appears)
	Purpose: Find the frequency of number
	**/

    int frequency(Object number)
    {
	Object[] jesus = new Object[this.size()]; //new array that allows us to search through the data
	int buddha = 0; //incrementer
	int moses = this.size(); //size of the stack, need it to stay constant

	while(this.isEmpty() == false) //this pops everything in the stack and puts it in our new array
	    {
		for (int i = 0; i < moses; i++)
		    {
			jesus[i] = this.pop();
		    }//while

	    }//while

	for (int x = 0; x<jesus.length; x++) //goes through the new array and counts the frequency, incrementing buddha
	    {
		if(jesus[x]==number) buddha++;
		   
	    }//for

	for (int j = moses-1; j >= 0; j--) //pushes everything back into the stack in original order
	    {
		this.push(jesus[j]);
	    }//for

	return buddha;

    }//frequency



}//class


