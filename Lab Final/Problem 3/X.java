class Human{
    void display1(){
        System.out.println("Student inheriting properties from Human Class");
    }
}

class Student extends Human{
    void display2(){
        System.out.println("I am a Student who belongs to Human class");
    }
}
class Engineer extends Student{
    void display3(){
        System.out.println("“Engineering Student inheriting properties from Student”.");
    }
}
public class X{
    public static void main(String args[]){
        Engineer e = new Engineer();
        e.display3();
        e.display2();
        e.display1();
    }
}