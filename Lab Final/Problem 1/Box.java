public class Box {
    static int height;
    static int width;
    static float depth;
    static int count;     

    Box(int h, int w, float d, int c){
        height = h;
        width = w;
        depth = d;
        count = c;
    }

    void displayResult(){
        for(int i= 1; i <=count; i++){
            float result = i * height * width * depth;
            System.out.println("Volume for box "+ i + " is " + result);
        }
    }

    public static void main(String[] args) {
        Box vol = new Box(5, 5, 5, 4);
        vol.displayResult();
    }
}
