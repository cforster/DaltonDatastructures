class BST
{
    NodeB root = null;

    //chars in the nodes

    //functions:
    //add**
    //print*
    //clear
    //search


    //add with string:
    void add(String s)
    {
	for(char c : s.toCharArray())
	    {
		add(root, c);
	    }
    }

    //add:
    void add(NodeB n, char c)
    {
	NodeB added = new NodeB();
	added.data=c;
	
	if(n==null) n=added;
	else if (c>n.data) 
	    {
		if(n.right!=null) add(n.right, c);
		else n.right=added;
	    }
	else 
	    {
		if(n.left!=null) add(n.left, c);
		else n.left=added;
	    }
    }

    void print()
    {
	print(root);
    }

    void print(NodeB n)
    {
	if(n==null) System.out.println("ext");
	else    
	    {
		System.out.println(n.data);
		print(n.left);
		print(n.right);
	    }
    }

}