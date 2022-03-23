class Langauge{

    void display_info(){
        System.out.println("display info - 0");
    }

    void display_info(int a){
        System.out.println("Display info - " + a);
    }

    double display_info(double a){
        System.out.println("display info - return");
        return a;
    }
}


public class Method_Overloading {
    public static void main(String[] args) {
        Langauge j = new Langauge();
        j.display_info();
        j.display_info(1);
        j.display_info(4.0);
    }
    
}