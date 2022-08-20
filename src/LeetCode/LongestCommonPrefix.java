package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args)
    {
        LongestCommonPrefix gfg = new LongestCommonPrefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));

    }

/*--------------------------Answer Function-------------------------*/
    public String longestCommonPrefix(String[] strs)
    {
 //Check: element inside array
        int size = strs.length;
        System.out.println("size: " +size); //4

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return strs[0];

// sort the array of strings
        Arrays.sort(strs);
        System.out.println("Sort " + Arrays.toString(strs));   //[geek, geeks, geeksforgeeks, geezer]

// find the minimum length from first and last string
        int minLength = Math.min(strs[0].length(), strs[size-1].length());

        System.out.println("a[0].length(): " +strs[0].length());  //4: because "geek" is 4
        System.out.println("a[size-1].length(): " + strs[size-1].length()); //6: because "geezer" is 6 char
        System.out.println("minLength: " +minLength); //4: because inside the array "geek" is the min length

// find the common prefix between the first and last string
        int i = 0;
        while (i < minLength && strs[0].charAt(i) == strs[size-1].charAt(i) )
            i++;
        System.out.println("a[0].charAt(i): " + strs[0].charAt(i));
        System.out.println("a[size-1].charAt(i): " + strs[size-1].charAt(i));

        boolean j = strs[0].charAt(i) == strs[size-1].charAt(i);
        System.out.println("a[0].charAt(i) == a[size-1].charAt(i): " + j);
        boolean k = i < minLength;
        System.out.println("i < minLength: " + k);
        System.out.println("i " + i);

        String pre = strs[0].substring(0, i);
        System.out.println("pre " + pre);
        return pre;
    }

    /* Driver Function to test other function */

}
