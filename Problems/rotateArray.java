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