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
    /*
      Author: annelise and derek
     */
    Object  peek()
    {
	return this.peek;


	//check to see that it isn't empty
	
	Object top = this.poll();
	
	//poll each item, and offer it to the bottom of the array until we ar at A
	this.offer("Annelise");

	//this doesn't work yet:
	Object move;
	do {
	    move=this.poll();
	} while(!move.equals("Annelise"));

	return top;
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
      delete everything from the queue:
     */
    void dump()
    {
	this.remove.......
    }
}