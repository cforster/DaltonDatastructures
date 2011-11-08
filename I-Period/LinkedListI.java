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



    public void removefirst(Node n)
    {
	first = n.pointer;
    }//removefirst


    public void removelast(Node n)
    {

        if(n.pointer.pointer!= null)  removelast(n.pointer);
          
	else if (n.pointer.pointer == null) n.pointer = null;
    
    }//removelast
}//class
    /*Name: Clone
      Function: Returns a duplicate of original LinkedList
      Authors: Maya Klabin and Xander Chase
    */

    public Node clone(Node n)
    {    
	
	if(n.pointer!=null)
	    {
		Node duplicate = new Node();
		duplicate.data = n.data;
		duplicate.pointer = clone(n.pointer);
		return duplicate;
	    }//if
	else
	    {
		Node duplicate = new Node();
		duplicate.pointer = null;
		duplicate.data = n.data;
		return duplicate;
	    }//else
    }//clone
}//class
