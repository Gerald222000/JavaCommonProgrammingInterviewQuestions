package Beginner;

public class BasicVariableAssignment {
    public static String nameString(String name) {
        String b = "Edabit";
        String result = name + b;
        return result;
    }
    public static void main(String[]args){
        System.out.println(nameString("Mubashir"));
    }
}
