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
