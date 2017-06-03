public class Methods {
	public static void main(String[] args) {
		System.out.println("hey there ;) you're pretty cool");
		float mySum = add(2f, 2f);
		System.out.println("mySum: " + mySum);

		System.out.println("subtraction: " 
			+ subtract(5, 3));
	}

	private static int add(int a, int b) {
		System.out.println("doing integers");
		return a + b;
	}

	private static int add(int a, int b, int c) {
		return add(a,b) + c;
	}

	private static float add(float a, float b) {
		System.out.println("doing floats");
		return a + b;
	}

	private static int subtract(int c, int d) {
		return c - d;
	}
}