package DataStructuresAndAlgorithms;

public class BigO {
    public void log(int[] numbers){
    //Linear Time
        //1: O(1)
        System.out.println(numbers[0]); //print first item in array

        //2: O(2)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        //3: O(n). n = number of input.
        for (int i=0; i<numbers.length;i++)
            System.out.println(numbers[i]);

        //4: O(1+n+1) or O(2+1) == O(n) because of linear runtime
        System.out.println();   //  O(1)
        for(int number: numbers)    // O(n)
            System.out.println(number);
        System.out.println();   //  O(1)

        //5: O(n+m)
        for(int number: numbers)    // O(n)
            System.out.println(number);
        double[] names= {1,2,3};
        for(double name: names)    // O(m)
            System.out.println(name);

        //6: Nested Loops O(n+n^2) or O(n^2)
        for(int number: numbers)    // O(n)
            System.out.println(number);

        for (int first : numbers)   // O(n)
            for (int second : numbers)  // O(n)
                System.out.println(first + ", " + second);

        //7: O(n^3)
        for(int first: numbers)    // O(n)
            for (int second: numbers)   // O(n)
                for (int third : numbers)  // O(n)
                    System.out.println(first + ", " + second + ", " + third);

        //8: O(n) space
        String[] copy = new String[names.length];
        for (int i =0; i< names.length; i++)
            System.out.println("Hi " + names[i]);

        //8: Logarithmic
        //9: Exponential

    }

    public static void main(String[] args) {
        BigO b = new BigO();

    }
}
