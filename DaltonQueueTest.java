// queue test class

public class DaltonQueueTest
{
    public static void main(String[] args)
    {
	DaltonQueue dq = new DaltonQueue();

	dq.add(3);
	dq.add(5);
	dq.add(8);
	dq.add(10);
	System.out.println(dq.peek_all());

    }
}
