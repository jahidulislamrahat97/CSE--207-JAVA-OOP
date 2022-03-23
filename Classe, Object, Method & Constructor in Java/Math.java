

public class Math {

    private int a, b;
    
    //create public method
    public int add_numbers(int a, int b){
        int sum = a+b;
        return sum;
    }

    //create private method
    private static int square(int num){
        int result = num * num;
        return result;
    }

    void set(int a, int b){
        this.a = a;
        this.b = b;
    }
    int get(){
        return a + b;
    }


    public static void main(String[] args) {
        Math math = new Math();
        System.out.println("Sum is: "+ math.add_numbers(20, 30));

        /*Static fields and methods are not belong to a specific object, 
        but to a class, 
        so you should access them from the class, and not from an object:*/
        System.out.println("square 1 is: "+ Math.square(20));
        System.out.println("square 2 is: "+ square(30));

        math.set(2, 3);
        System.out.println("get is: "+ math.get());
    }
}
