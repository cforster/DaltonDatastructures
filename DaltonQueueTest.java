// queue test class

public class DaltonQueueTest
{
    public static void main(String[] args)
    {
	DaltonQueue dq = new DaltonQueue();

	dq.add(3);
	dq.add(8);
	dq.add(5);
	dq.add(10);
	System.out.println(dq.peek_all());
	//System.out.println(dq.length());
	//System.out.println(dq.search(3));
	//System.out.println(dq.length());
	dq.sort();
	System.out.println(dq.peek_all());
	//	dq.dump();
	//System.out.println(dq.search(3));
	//dq.dump();    //katherine's- will return 0

	System.out.println(dq.length());// sophia's- will return 0 after dump 
	//System.out.println("Now we are doing replace");
	dq.ReplaceAt(3, 4);
	//System.out.println("testing");
	System.out.println(dq.peek_all());

    }
    
}