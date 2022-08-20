package LeetCode;


import java.util.Arrays;

public class TwoSum {

    public static void main(String[]args){
        TwoSum s = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        TwoSum r = new TwoSum();
        int[] a = r.twoSum(nums,target);
        System.out.println(Arrays.toString(a));

    }

    public int[] twoSum(int[] nums, int target) {
        int[] resultarray= new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++)
            {
                if(target==nums[i]+nums[k])
                {
                    resultarray[0]=i;
                    resultarray[1]=k;
                }
            }
        }
        return resultarray;
    }
}
