package Beginner;

public class PowerCalculator {
    public static int power(int voltage, int current){
        return voltage * current;
    }
    public static void main(String[] args) {
        System.out.println(power(230,10));
    }
}
