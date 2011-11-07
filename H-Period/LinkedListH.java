public class LinkedListH{

    Node first; //pointer to a Node

    LinkedListH(){}

    void  addfirst(double data)
    {
	Node newone = new Node();
	newone.setData(data);
	newone.setPointer(first);
	first = newone;
    }
    void print(Node n)
    {
	System.out.println(n.getData());
        if(n.getPointer()!=null)
	    {
		print(n.getPointer());
	    }   
    }

    int size(Node n)
    { 
	if (n.getPointer()!=null)
	    {
		return 1+size(n.getPointer());
	    }
	return 1;
    }

    void set(Node n, int index, double d)
    {
	if (!(index==0))
	    {
		set(n.getPointer(), index-1, d);
      	    }
	n.setData(d);
}//class

    /* Annelise (clear fuction)*/

       void clear()
       {
	   Node first = header.next();
	   while (first !=header)
	       {
		   Node.next = first.next;
		   first.next = first.previous = null;
		   first = null;
		   first = next;
	       }

	   header = header.next = header.previous;
	   size = 0;
      }

    /*public void clear()
      {
          first = null;
	  return 0;
      }