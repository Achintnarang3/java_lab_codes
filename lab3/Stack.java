package lab3;

class Stack
{
	private int arr[];
	private int top;
	private int n;

	
	Stack(int size)
	{
		arr = new int[size];
		n = size;
		top = -1;
	}

	
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	
	public int pop()
	{
		// check for stack underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + peek());

		
		return arr[top--];
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}

	
	public int size()
	{
		return top + 1;
	}

	// Utility function to check if the stack is empty or not
	public Boolean isEmpty()
	{
		return top == -1;	
	}

	// Utility function to check if the stack is full or not
	public Boolean isFull()
	{
		return top == n - 1;	
	}

	public static void main (String[] args)
	{
		Stack stack = new Stack(3);

		stack.push(1);		
		stack.push(2);	
                stack.push(3);	
                stack.push(4);

		stack.pop();		
		stack.pop();		

		stack.push(4);		

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		stack.pop();		

		// check if stack is empty
		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}
}