class BinarySearch
{
    NodeB root=null;

    public void add(char c)
    {
	add(c, root);
    }
    

    public  void add(char c, NodeB n)
    {
	NodeB temp=new NodeB();
	temp.data=c;
	
	if(n==null) n=temp;
	else if(c>n.data) 
        {
	    if(n.right!=null) add(c, n.right);
	    else n.right=temp;
        }
	else
        {    
	    if(n.left!=null)  add(c, n.left);
	    else n.left=temp;
	}
    }

    public void print(NodeB n)
    {
	if (n==null) System.out.println("empty!");
	else
        {
	    System.out.println(n.data);
	    print(n.left);
	    print(n.right);
	}

    }


}
