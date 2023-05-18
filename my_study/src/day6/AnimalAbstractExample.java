package day6;

public class AnimalAbstractExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
