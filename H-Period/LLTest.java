public class LLTest
{
    public static void main (String[] args)
    {
	LinkedListH myList = new LinkedListH();
	myList.addfirst(3);
	myList.addfirst(4);
	myList.addfirst(5);
	myList.print(myList.first);
	myList.clear(myList.first);
	System.out.println(myList.size(myList.first));
	System.out.println(myList.isEmpty());
	System.out.println(myList.contains(myList.first, 4.0));


	myList.get(1, myList.first); // get

	double[] testArray = myList.toArray(); //toArray

	for (int i=0; i<testArray.length; i++)
	    {
		System.out.println(testArray[i]);
	    }


    }

}