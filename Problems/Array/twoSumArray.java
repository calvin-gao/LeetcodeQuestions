package Problems.Array;
import java.util.*;

/*
Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class twoSumArray 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < nums.length; i++)
        {
            if(hashmap.containsKey(target - nums[i]))
            {
                result[0] = i;
                result[1] = hashmap.get(target - nums[i]);
                return result;
            }
            hashmap.put(nums[i] , i);
        }
        return result;
    }
}