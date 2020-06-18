package Problems;
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
        HashMap<Integer,Integer> numSeen = new HashMap<>();
        for(int i : nums)
        {
            numSeen.put(i, numSeen.getOrDefault(i,0) + 1);
        }
        for(int i : nums)
        {
            if(numSeen.get(i) == 1)
            {
                return i;
            }
        }
        return 0;
    }
}