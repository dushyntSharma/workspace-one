package test;

public class throwException {
//	public void checkAge(int age) {
//		if (age < 18)
//			throw new ArithmeticException("Not Eligible for voting");
//		else
//			System.out.println("Eligible for voting");
//	}
//
//	public static void main(String args[]) {
//		throwException obj = new throwException();
//		obj.checkAge(12);
//		System.out.println("End Of Program");
//	}
//}

	public int division(int a, int b) throws ArithmeticException {
		int t = a / b;
		return t;
	}

	public static void main(String args[]) {
		throwException obj = new throwException();
		try {
			System.out.println(obj.division(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("You shouldn't divide number by zero");
		}
	}
}
