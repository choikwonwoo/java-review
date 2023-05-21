package day9;

public class ClassCastExceptionExaple {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		change(dog);
		change(cat);
	
	}
	static void change(Animal animal){
		Dog dog = (Dog) animal; // cat 인경우 예외 발생! 
	}
}
class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
