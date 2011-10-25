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
    
    /*
      Author: Sophia
      Function: length
    */
    public int length()
    {
	offer("end of array");
	int length =0;
	
	while(peek().toString().equals("end of array")) 
	    {
		offer(poll());
		length++;
	    }
	return length; 
    }


    /* 
       Author: ISABELLA and malina. 

     */

    void ReplaceAt(int index; int new)
    {
	Array[index] = new;
    }




    



    /*
      delete everything from the queue:
     */
    void dump()
    {
	this.remove.......
    }
}