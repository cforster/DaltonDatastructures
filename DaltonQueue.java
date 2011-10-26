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

public class DaltonQueue extends java.util.Queue
{
<<<<<<< HEAD
    /*
      Author: annelise
     */
    Object  peek()
    {
	return this.peek;


	//check to see that it isn't empty
	
	Object top = this.poll();
	
	//poll each item, and offer it to the bottom of the array until we ar at A
	this.offer("Annelise");

	//move the objects up until we detect annelise at the end of the array and we know that the first is back up to the top
	Object move;
	do {
	    move=this.poll();
	} while(!move.equals("Annelise"));

	return top;
    }
    
=======
    public string peek_all()
    {
	String input="";
	for (i=front; i<back; i++)
	    {
		input=input+ ", " + Array[index];
	    }
	System.out.println(input);
    }
>>>>>>> origin/master
    /*
      Author: Sophia
      Function: length
    */
    public int length()
    {
	this
	return front-back; 
    }


    /* 
       Author: ISABELLA and malina. 

     */

    void ReplaceAt(int index; int new)
    {
	Array[index] = new;
    }

<<<<<<< HEAD
=======


>>>>>>> origin/master
    /*
      Author: Isabella
     */
    

    //in progress
    void sort()
    {
	//make the queue into the array:
	Object[] queue = new Object[queue.size()]; 
	int counter = 0;
	while (!this.isEmpty()) //go through the queue
	    {
		queue[counter]= this.poll();
	    }

	//sort the array:
	if(queue[counter]<queue[counter--])	 
	    {
	  
	    }
	

	//return it to the queue:
    }

    /*
      Author: Katherine 
      Function: Reverse (in ABC, out CBA)
    /*
    void reverse 
    {
    
	/*
	  Author: Katherine
	  Function: Dump (delete everything from the queue)
	*/
	void dump()
	{
	    while(!this.isEmpty())
		{
		    this.remove();
		} 
	}
	


    }


      Author: Shein
      Function: switch(x,y)
      parameters: x and y are both distances from the front of the queue
      return: nothing
    */
    void switch(int x, int y)
	{
	    
	}
}