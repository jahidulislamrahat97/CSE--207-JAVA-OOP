class Employee{
    double salary = 30000;
    static int count = 0;
    void count_n(int n){
        count = count + n;
    }
}

class Teacher{
    double bonus, extra_income;
    static int i=0;
    Employee e = new Employee();

    Teacher(double b, double ei){
        bonus = b;
        extra_income = ei;
    }

    void display_total_payment(int n){
        double TeacherTotalIncome = e.salary + bonus + extra_income;
        i = i+1;
        System.out.println("Teacher "+i+" total income is : "+TeacherTotalIncome);
        e.count_n(n);
    }
}

class TA{
    double bonus1;
    static int i=0;
    Employee e = new Employee();

    TA(double b){
        bonus1 = b;
    }

    void display_total_payment1(int n){
        double TATotalIncome = e.salary + bonus1;
        i = i+1;
        System.out.println("TA "+i+" Total income is : "+ TATotalIncome);
        e.count_n(n);
    }
}

public class X {
    public static void main(String[] args) {
        Employee e = new Employee();

        Teacher t1 = new Teacher(100, 200);
        t1.display_total_payment(1);
        Teacher t2 = new Teacher(200, 200);
        t2.display_total_payment(1);
        Teacher t3 = new Teacher(300, 200);
        t3.display_total_payment(1);

        TA ta_1 = new TA(200);
        ta_1.display_total_payment1(1);
        TA ta_2 = new TA(300);
        ta_2.display_total_payment1(1);
        TA ta_3 = new TA(400);
        ta_3.display_total_payment1(1);



        System.out.println("Total Employee: " + (e.count));
    }
}