package inheritance;

public class Dog extends Animal {
    private int tial = 1;

    public static void main(String[] args) {
        Dog obj = new Dog();// child class object
        obj.name = "Rocky";
        obj.barking();// child class method
        System.out.println(obj.name);


        Animal obj1 = new Animal();// parent class object
        obj1.eat();// parent class method
        obj1.move();// parent class method
    }
    public void barking(){
        System.out.println("dog is barking");
    }
}
