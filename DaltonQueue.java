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
	
	while(peek().toString().!equals("end of array")) 
	    {
		offer(poll());
		length++;
	    }
	return length; 
    }

    /*                                                                          
      Author: Sophia + Annelise                                                            
      Function: peek all                                                          
    */
    public int peekAll()
    {
        offer("peek all array");
       

        while(poll().toString().!equals("peek all array"))
            {
                offer(poll());
		return poll();
            }
        
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