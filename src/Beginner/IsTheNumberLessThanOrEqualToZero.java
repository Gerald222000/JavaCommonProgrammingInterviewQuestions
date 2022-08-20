package Beginner;

public class IsTheNumberLessThanOrEqualToZero {
    public static boolean lessThanOrEqualToZero(int num) {
        boolean check = false;
        if(num<=0){
            check = true;
        }return check;
    }

    public static void main(String[] args) {
        System.out.println(lessThanOrEqualToZero(-1));
    }
}
