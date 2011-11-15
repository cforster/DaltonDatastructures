import java.util.Random;
public class LinkedListI
{
    
    Node first;//is a pointer

    public void add(int data)
    {
	Node temp = new Node();
	temp.pointer = first;
	temp.data = data;
	first = temp;
    }//add    
    /*  
     Authors: Taylor Wright and Harrison DiPirinzio
     Input: Index and Node
     Output: Int
    Function: Takes a node and pritns the data from that node
    */

    public int get(int index, Node n)
    {
	if(index==0)return n.data; 
	return get(index-1,n.pointer);
    }//get

    /*
    Authors: Taylor Wright and Harrison DiPirinzio
    Input: Null
    Output: Null
    Function: Converts Linked List to an Array
    
    EDITS: Maya added return statemet, initially it was void, I changed it to int[] in order to use in shuffle
    */

    public int[] toArray()
    {
	int[] one = new int[this.size(first)];
	Node temp=first; 

	for(int i=0; i<one.length; i++)
	    {
		one[i]=temp.data;
		temp=temp.pointer;
	    }//for loop
	return one;
    }//toArray


    public int factorial(int n)
    {
	if(n==1) return 1;
	return n*factorial(n-1);

    }//factorial

    public void print(Node n)
    {
       
	System.out.println(n.data);

	if(n.pointer!= null)
	    {
		print(n.pointer);
	    }
    }//print

    public int size(Node n)
    {
		
	if(n.pointer!=null)
	    {
		return 1+size(n.pointer);
	    }

	return 1;
    }//size


   public void set(int index, int data, Node n)
    {
	if(index==0) n.data=data;
	else set(index-1, data, n.pointer);
    }//set


    public boolean isEmpty(Node n)
    {
	if(first==null) return true;
	else return false;

    }//isEmpty




/**
       Authors: Emily Lovett and Alex Mayer
       Input: Node n
       Output: nothing
       Function: Removes the first node in the linked list by setting "first" to the second one.
     **/

    public void removefirst(Node n)
    {
	first = n.pointer; //makes first point to the second node
    }//removefirst

/**
       Authors: Emily Lovett and Alex Mayer
       Input: Node n
       Output: nothing
       Function: Removes the last node in the linkedlist by setting the second to last node's pointer to null. 
     **/

    public void removelast(Node n)
    {
        if(n.pointer.pointer!= null)  removelast(n.pointer);
          
	else if (n.pointer.pointer == null) n.pointer = null; //sets second to last node's pointer as null    
    }//removelast


    //By Michael Zhao
    /**
       Author: Michael Zhao
       Input: int keep, node n
       Output: Nothing (It is a void)
       Function: Retains only the elements in this list that are contained in the specified int
       In other words, removes from this list all the elements that are not contained in the specified int



     **/
    public void retain(int keep, Node n)
    {

	if(n.pointer!=null)//loop through all the nodes
	    {
		if(n.data!=keep)
		    {
			//delete this item
			n.pointer = n.pointer.pointer;//the pointer skips this node
			retain(keep, n.pointer.pointer);
		    }
		else
		    {
			//keep this item
			retain(keep, n.pointer);
		    }

	    }	

    }
    //By Michael Zhao 




    /**
       Authors: Emily Lovett and Alex Mayer
       Input: index, node n
       Output: nothing
       Function: Can remove any node in the linkedlist, also can remove first and last ones.

     **/
    public void remove(int index, Node n)
    {
        if(index==1) n.pointer = n.pointer.pointer; //when the index is 1 (index increments down every time you run), sets n.pointer to n.pointer.pointer to skip over the node 
	
	else if(index==0) removefirst(n); //to remove the first node... sends it to removefirst

        else remove(index-1, n.pointer); //when index isn't 1 (so when it's not BEFORE the node you want to remove), it runs the function again, removing one and moving to the next node
    }//set  

    /**Name: Clone
      Function: Returns a duplicate of original LinkedList
      Authors: Maya Klabin and Xander Chase
      Input: original list
      Output: duplicated list
    */
    public Node clone(Node n)
    {    
	if(n.pointer!=null)
	    {
		Node duplicate = new Node();
		duplicate.data = n.data;
		duplicate.pointer = clone(n.pointer);
		return duplicate;
	    }//if, duplicated all data into a new node, transfering pointer info
	else
	    {
		Node duplicate = new Node();
		duplicate.pointer = null;
		duplicate.data = n.data;
		return duplicate;
	    }//else, duplicated data and pointer info for the last node
    }//clone


    /*
      Name: remove all
      Function: makes first node null, which clears the linked list
      Authors: Maya Klabin
      Input: nothing
      Output: nothing
     */

    public void removeAll()
    {
	first = null;
    }//removeAll


    /*Name: Shuffle
      Function: Randomizes order of elements
      Authors: Maya Klabin / Xander Chase helped create idea and worked on logic (unable to write code because he was at MUN)
      Input: nothing
      Output: nothing
     */

    public void shuffle()
    {
	Random rand = new Random();
	int[] newarray = toArray();
	for( int i =0; i < newarray.length; i++)
	    {
		int ranpos = rand.nextInt(newarray.length);
		int temp = newarray[i];
		newarray[i] = newarray[ranpos];
		newarray[ranpos] = temp;
	    }
	removeAll();
	for(int t : newarray)
	    {
		add(t);
	    }
    }//shuffle

}//class
   
