class Animal{
    protected void print_1(){
        System.out.println("Hello from protected");
    }

    public void print_2(){
        System.out.println("Hello from public");
    }

    private void print_3(){
        System.out.println("Hello from private");
    }

    void diplayt(){
        print_1();
        print_2();
        print_3();
    }
}

class Dog extends Animal{

    void bark(){
        print_1();
        print_2();
        //print_3();
    }
    
}

public class public_protected_private{
    public static void main(String[] args) {
        Animal a = new Animal();

        a.print_1();
        a.print_2();
        //a.print_3();
        System.out.println("In Animal");
        a.diplayt();

        System.out.println("after dog");
        Dog d = new Dog();

        d.bark();
    }
}