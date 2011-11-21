class DaltonStackTest
{


    public static void main(String[] args)
    {
	DaltonStack myStack= new DaltonStack();

	myStack.add(8);
	myStack.add(10);
	myStack.add(5);
	myStack.add(11);
	myStack.add(2);


	System.out.println(myStack.subStack(1,3));
    }

}