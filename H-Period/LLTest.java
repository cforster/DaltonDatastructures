public class LLTest
{
    public static void main (String[] args)
    {
	LinkedListH myList = new LinkedListH();
	myList.addfirst(3);
	myList.addfirst(4);
	myList.addfirst(5);
	myList.print(myList.first);
	System.out.println(myList.size(myList.first));


	myList.get(1, myList.first);

    }

}