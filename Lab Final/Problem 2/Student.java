class Person{
    String name;
    int age;
    double weight;   
}

public class Student{
    int id, roll;
    String versity_name;
    
    Person p = new Person();

    Student (String n, int a, double w, int i, int r, String u_n){
        p.name       = n;
        p.age        = a;
        p.weight     = w;
        id           = i;
        roll         = r;
        versity_name = u_n;
    }
    void display(){
        System.out.println("Name :"+ p.name);
        System.out.println("Age :"+ p.age);
        System.out.println("Weight :"+ p.weight);
        System.out.println("ID :"+ id);
        System.out.println("Roll :"+ roll);
        System.out.println("University :"+ versity_name);
    }

    public static void main(String[] args) {
        Student s = new Student("Rahat", 23, 50, 11111, 50, "DIU");
        s.display();
    }
}
