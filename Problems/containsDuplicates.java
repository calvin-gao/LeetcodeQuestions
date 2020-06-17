package Problems;
import java.util.*;


public class containsDuplicates {
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1; ++i)
        {
            if(nums[i] == nums[i + 1])
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateHash(int [] nums)
    {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int x : nums)
        {
            if(set.contains(x))
            {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}