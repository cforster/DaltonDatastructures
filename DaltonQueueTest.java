// queue test class
public class DaltonQueueTest extends DaltonQueue
{ 
    public static void main(String[] args)
    { 
	DaltonQueue classQueue = new DaltonQueue();
	classQueue.offer(3);
	classQueue.offer(4);
	System.out.println(classQueue.length());
	classQueue.dump();
	System.out.println(classQueue.length());
    }
    
}