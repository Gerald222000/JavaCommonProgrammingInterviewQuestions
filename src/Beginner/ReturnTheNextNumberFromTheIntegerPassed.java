package Beginner;

public class ReturnTheNextNumberFromTheIntegerPassed {
    public static int addition(int num) {
        return num++;
    }

    public static void main(String[] args) {
        System.out.println(addition(9));
    }
}
