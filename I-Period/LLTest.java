public class LLTest
{
    public static void main(String[] args)
    {
	LinkedListI mylist = new LinkedListI();
	mylist.add(1);
	mylist.add(2);
	mylist.add(3);


	
	mylist.print(mylist.first);

	mylist.clear();

	mylist.add(1);
	mylist.add(1);	
	mylist.add(1);
	
	mylist.print(mylist.first);



	
    }//main

}//class