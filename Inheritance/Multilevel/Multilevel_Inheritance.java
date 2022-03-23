/*
A - super class
↓
B - sub class
*/
class A{
    void print_A(){ 
        System.out.println("Class A"); 
    }
}


/*
B - super class
↓
C - sub class
*/

class B extends A{
    void print_B(){
        System.out.println("Class B");
    }
}

class C extends B{
    void print_C(){
        System.out.println("Class C");
    }
}




public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.print_C();
        c.print_B();
        c.print_A();

        B b = new B();
        b.print_B();
        b.print_A();

        A a = new A();
        a.print_A();
    }
}
