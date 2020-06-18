/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/



package Problems;

public class rotateArray{
    public static void main (String args[])
    {
        int [] arrTest = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arrTest,k);
        for(int i = 0; i < arrTest.length; i++)
        {
            System.out.println(arrTest[i]);
        }
    }

    public static void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums, k , nums.length-1);
    }

    public static void reverse(int [] nums, int beginning, int end)
    {
        while(beginning < end)
        {
            int temp = nums[beginning];
            nums[beginning] = nums[end];
            nums[end] = temp;
            beginning++;
            end--;
        }
    }
}