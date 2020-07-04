package Problems.Array;
import java.util.*;
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
*/
public class SingleNumber
{
    public int singleNumber(int[] nums)
    {
        HashMap<Integer,Integer> seen = new HashMap<Integer,Integer>();
        for(int num : nums)
        {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        for(int num: nums)
        {
            if(seen.get(num) == 1)
            {
                return num;
            }
        }
        return 0;
    }
}