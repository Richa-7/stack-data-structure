import java.util.Scanner;

public class StackUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		
		while(true) {
			System.out.println("Enter your choice :-");
			System.out.println("1. Is stack empty");
			System.out.println("2. Push an element");
			System.out.println("3. Pop an element");
			System.out.println("4. Peek an element");
			System.out.println("5. Exit");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : System.out.println(stack.isEmpty());
						 break;
				case 2 : System.out.println("Enter an element");
				         int num = sc.nextInt();
				         stack.push(num);
				         break;
				case 3 : stack.pop();
						 break;
				case 4 : System.out.println(stack.peek());
						 break;
				case 5 : System.exit(0);
			}
			
		}
		

	}

}

class Stack{
	static final int MAX = 5;
	int top;
	int[] array = new int[MAX]; 
	
	Stack() {
		top = -1;
	}
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	boolean push(int num) {
		if(top >= (MAX-1)) {
			System.out.println("Stack overflow");
			return false;
		}
		array[++top] = num;
		System.out.println("Element pushed successfully");
		return true;	
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("stack Underflow");
			return 0;
		}
		System.out.println("Element popped successfully");
		return array[top--];
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("stack Underflow");
			return 0;
		}
		return array[top];	
	}
}
