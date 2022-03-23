class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meaow(){
        System.out.println("meoawing...");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.meaow();
    }
}
