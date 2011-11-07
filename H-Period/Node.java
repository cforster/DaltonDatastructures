public class Node{
    double data;
    Node pointer = null;

    void setPointer(Node x)
    {
	pointer = x;
    }
    
    void setData(double d)
    {
	data = d;
    }

    double getData()
    {
	return data;
    }
    
    Node getPointer()
    {
	return pointer;
    }
}//class