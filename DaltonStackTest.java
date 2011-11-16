class DaltonStackTest
{


    public static void main(String[] args)
    {
	DaltonStack myStack= new DaltonStack();

	myStack.add(1);
	myStack.add(2);
	myStack.add(3);
	myStack.add(4);
	myStack.add(5);

	myStack.reverse();
	myStack.deleteAll();
        System.out.println(myStack.pop());
	   

}
}