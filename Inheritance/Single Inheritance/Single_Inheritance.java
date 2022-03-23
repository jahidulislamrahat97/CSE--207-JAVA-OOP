import javax.swing.text.StyledEditorKit;

//superclass
class Animal{
    // method in the superclass
    void eat(){
        System.out.println("I can eat");
    }
}

//subclass
class Dog extends Animal{
    // new method in subclass
    void bark(){
        System.out.println("I can bark");
    }

    // overriding the eat() method
    @Override
    void eat(){
        System.out.println("I eat dog food.");
    }
}


public class Single_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        
        d.bark();
        d.eat();

        a.eat();
    }
}
