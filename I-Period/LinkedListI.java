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

    }

    public void print(Node n)
    {
       
	if(n!=null) System.out.println(n.data);

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

    //stern/dubin
    public void clear()
    {
	first=null;
    }//clear
   
    //stern/dubin
    public int indexOf (int o)
    {
	if (o==
	    {


	    }

	 else return -1;

    }//indexOf

}//class