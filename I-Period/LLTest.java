import java.util.Arrays;
public class LLTest
{
    public static void main (String[] args)
    
    {
	LinkedListI mylist = new LinkedListI();

	//	System.out.println(mylist.isEmpty(mylist.first));

	//	mylist.add(1);
	//	mylist.add(2);
	//	mylist.add(3);


	
	//mylist.print(mylist.first);

	//	mylist.clear();

	mylist.add(1);
	mylist.addLast(2);	
	mylist.addLast(3);
	
	System.out.println(mylist.indexOf(3));

	/*	
	mylist.print(mylist.first);


    
	int[] arraytest = mylist.toArray();
	System.out.println("to array test");
	System.out.println(Arrays.toString(arraytest));
	
	mylist.print(mylist.clone(mylist.first));


	//By MZ
	//mylist.retain(2, mylist.first);
	//System.out.println("MZ retain is 2");
	//By MZ

	System.out.println(mylist.isEmpty(mylist.first));

	
       mylist.print(mylist.clone(mylist.first));
	System.out.println("shuffleTest");
	mylist.shuffle();
	System.out.println(Arrays.toString(mylist.toArray()));
	
	System.out.println("Testing removeall nodes = " + Arrays.toString(mylist.toArray()));
	mylist.removeAll();
	if(mylist.first == null)
	System.out.println("NULL!");
	*/
    }//main

}//class