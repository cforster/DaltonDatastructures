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

    public int get(int index, Node n)
    {
	if(index==0)return n.data; 
	return get(index-1,n.pointer);
    }
    
    //we are 
    public void toArray()
    {
	int[] one = new int[this.size(first)];
	Node temp=first; 

	for(int i=0; i<one.length; i++)
	    {
		one[i]=temp.data;
		temp=temp.pointer;
	    }

    }


    public int factorial(int n)
    {
	if(n==1) return 1;
	return n*factorial(n-1);

    }

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