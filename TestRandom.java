import java.util.Stack;
public class TestRandom
{
    public static void main (String[]args)
    {
        Stack test = new Stack();

	test.push(3);
	test.push(4);
	test.push(5);
	test.push(6);
	test.push(7);
	test.push(8);
	test.push(9);

	test.randomize();
	System.out.println(test);
        
    }
}

