class Langauge{
    public void display_info(){
        System.out.println("Common English Langauge");
    }
}

class Java extends Langauge{
    public void display_info(){
        System.out.println("Java Programming Langauge");
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        Java j = new Java();
        j.display_info();
    }
    
}
