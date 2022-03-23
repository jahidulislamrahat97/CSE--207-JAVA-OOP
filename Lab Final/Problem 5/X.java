class Employee{
    double salary = 30000;
    int count = 0;
}

class Teacher{
    double bonus, extra_income;
    Employee e = new Employee();

    Teacher(double b, double ei){
        bonus = b;
        extra_income = ei;
    }

    void display_total_payment(int n){
        double TeacherTotalIncome = e.salary + bonus + extra_income;
        System.out.println("Teacher's total income is : "+TeacherTotalIncome);
        e.count = e.count + n;
        System.out.println("e count"+e.count);
    }
}

class TA{
    double bonus1;
    Employee e = new Employee();

    TA(double b){
        bonus1 = b;
    }

    void display_total_payment1(int n){
        double TATotalIncome = e.salary + bonus1;
        System.out.println("TA Total income is : "+ TATotalIncome);
        e.count = e.count + n;
        
    }
}

public class X {
    public static void main(String[] args) {
        Employee e = new Employee();

        Teacher t1 = new Teacher(100, 200);
        t1.display_total_payment(1);
        Teacher t2 = new Teacher(100, 200);
        t2.display_total_payment(1);

        System.out.println("Count: " + (e.count));


        
        

    }
}