import java.util.Stack;
class EmilyandAlexTest {

    public static void main(String[] args){


	DaltonStack myStack = new DaltonStack();

	myStack.push(6);
	myStack.push(5);
	myStack.push(3);
	myStack.push(6);

	System.out.println(myStack.frequency(6)); 


    }



}