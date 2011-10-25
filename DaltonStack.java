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


 /*delete all(Xander), substack(jeff, alex), convert(), delete one(michael, josh), reverse (taylor, harry), frequency(emily), length/size (maya/dubin)*/


 */
public class DaltonStack extends java.util.Stack
{

   
    /*
      takes a portion (from i to j) of the original Stack

     */
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

    /*
      Function: DelOne
      description: Deletes an item from anywhere in the stack & replaces all that were above it
      Authors: Josh Kaye and Michael Zhao
      Input: Desired item to delete
      Output: none
      Notes: none

    public void deleteOne(int blah)
    {

    
    while (found==false)
    {
    for(int i=0; i<stack.length; i++)
    {
    if (Stack.peek==blah;    found = true;
    else found = false;
    }


    }

    }

}