package test;

//Interfaces does not have body at all
//they will be implemented based on the other classes

//An interface is a completely "abstract class" 
//that is used to group related methods with empty bodies:
//implemented is used to access

interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

class Interface {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}}


//Interface I{
//	public void D() {
//	}
//}
//
//class A implements I {
//	public void D() {
//		sys();
//	}	
//}
//main{
//	A a = new A();
//	a.D();
//}