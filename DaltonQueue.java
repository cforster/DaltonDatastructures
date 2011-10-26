/*
Authors:
Charles Forster
Isabella Giovannini
Jason Shein
Katherine Odom
Malina Buturovic
Derek Whang
Annelise Steele <3
Sophia Edelstein 
 */

public class DaltonQueue extends java.util.Queue
{
    public string peek_all()
    {
	String input="";
	for (i=front; i<back; i++)
	    {
		input=input+ ", " + Array[index];
	    }
	System.out.println(input);
    }
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


    /*
      Author: Shein
      Function: switch(x,y)
      parameters: x and y are both distances from the front of the queue
      return: nothing
    */
    void switch(int x, int y)
	{
	    
	}
    

>>>>>>> origin/master
}