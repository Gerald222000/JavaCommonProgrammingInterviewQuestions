package Beginner;

public class Main {
    public static void main(String[]args){
        // Problem Number 1: Pass the value of a variable to another variable.
        int number1 = 1;
        int number2 = number1;

        System.out.println(number2);

        //Anything String Manipulation. Get the "World!" in "Hello World!" String.
        String s = "Hello World!";

        //  Use subString to get the index of the String from Start to End of the index.
        String world = s.substring(6,12);   //  We need to assign it on another variable
        System.out.println(world);

        //Get the total number of the array
        String string[] = {"wew", "wews", "wewes"};
        System.out.println(string.length);

        //In a array that have five value get one value
        String[] S= { "ONE", "TWO", "THREE", "FOUR" };
        System.out.println(S[2].length());

        // Problem Number 3: Get the highest Number in the array
        int arr[] = { 1 ,2 ,10 ,4 ,5 ,6};
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);

        // Get the Smallest length number
        String n1 = "number";
        String n2 = "num";

        int n = Math.min(n1.length(), n2.length());
        System.out.println(n);
    }
}
