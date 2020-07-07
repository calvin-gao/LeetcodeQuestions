/* 
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45*/


package Problems.DynamicProgramming;
import java.util.*;

public class climbingStair {
    public int climbStairs(int n) 
    {
        if(n == 1){
            return 1;
        }
        int [] storage = new int[n];

        storage[0] = 1;
        storage[1] = 2;

        for(int i = 2; i < n; i++){
            storage[i] = storage[i - 1] + storage[i - 2];
        }

        return storage[n - 1];
    }

    public int climbStairs2(int n) 
    {
        if(n == 1){
            return 1;
        }

        int first = 1;
        int second = 2;

        for(int i = 2; i < n; i++){
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}