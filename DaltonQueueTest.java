// queue test class
public class DaltonQueueTest extends DaltonQueue
{ 
    public static void main(String[] args)
    { 
	DaltonQueue classQueue = new DaltonQueue();
	classQueue.offer(3);
	classQueue.offer(4);
	System.out.println(classQueue.length());
	System.out.println(classQueue.search(3));
	classQueue.dump();
	System.out.println(classQueue.length());
    }
    
}