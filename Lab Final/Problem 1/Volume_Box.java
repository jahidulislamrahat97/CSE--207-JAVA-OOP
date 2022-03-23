class Box {
    static double height;
    static double width;
    static double depth;
    static int count;     

    Box(double h, double w, double d, int c){
        height = h;
        width = w;
        depth = d;
        count = c;
    }

    void displayResult(){
        for(int i= 1; i <=4; i++){
            double result = i * height * width * depth;
            System.out.println("Volume for box "+ i + " is " + result);
        }
    }

}

public class Volume_Box{
    public static void main(String[] args) {
        Box vol = new Box(5, 5, 5, 4);
        vol.displayResult();
    }
}