public class LLTest
{
    public static void main(String[] args)
    {
	LinkedListI mylist = new LinkedListI();

	System.out.println(mylist.isEmpty(mylist.first));

	mylist.add(1);
	mylist.add(2);
	mylist.add(3);

	mylist.set(2, 4, mylist.first);
	
	mylist.print(mylist.first);

	System.out.println(mylist.factorial(5));

	System.out.println(mylist.size(mylist.first));

<<<<<<< HEAD

	//By MZ
	mylist.retain(2, mylist.first);
	System.out.println("MZ retain is 2")
	//By MZ
=======
	System.out.println(mylist.isEmpty(mylist.first));

	
	mylist.print(mylist.clone(mylist.first));
>>>>>>> origin/master
	
    }//main

}//class