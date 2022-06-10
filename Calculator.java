package calculaterDemo;

public class Calculator {
	
	private int a;
	private int b;
	

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Calculator() {
		
	}

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}


	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println("Sum of given two number is : "+c1.add(5,6));
		System.out.println("Substraction of given two number is : "+c1.sub(5,6));
		
	}

}
