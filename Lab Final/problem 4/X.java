class Employee {
    double salary = 50000;
}
class Teacher {
    Employee e = new Employee();

    double bonus = 10000;
    double T_salary_bonus;

    void display_total_payment(){
        T_salary_bonus = e.salary + bonus;
        System.out.println("Teacher Salary with Bonus: " + T_salary_bonus);
    }
}
class TA{
    Employee e = new Employee();

    double bonus1 = 500;
    double TA_salary_bonus = e.salary + bonus1;
    
    void display_total_payment1(){
        System.out.println("TA Salary with Bonus: " + TA_salary_bonus);
    }
}

public class X {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.display_total_payment();
        TA ta = new TA();
        ta.display_total_payment1();

        double t_ta_cap = t.T_salary_bonus + ta.TA_salary_bonus;
        System.out.println("Teacher & TA Capability: " + t_ta_cap);
    }
}