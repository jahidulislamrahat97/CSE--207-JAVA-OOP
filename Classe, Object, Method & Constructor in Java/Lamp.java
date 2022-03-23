public class Lamp {

    boolean is_on;

    void turn_on(){
        is_on = true;
        System.out.println("Led is: " + is_on);
    }

    void turn_off(){
        is_on = false;
        System.out.println("Led is: " + is_on);
    }


    public static void main(String[] args) {
        Lamp led = new Lamp();
        led.turn_on();
        led.turn_off();
    }
    
}
