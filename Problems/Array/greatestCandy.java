package Problems.Array;
import java.util.*;

public class greatestCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        int maxCandy = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandy){
                maxCandy = candies[i];
            }
        }
        for(int i = 0 ; i < candies.length; i++){
            if(candies[i] + extraCandies > maxCandy){
                res.add(i, true);
            }else{
                res.add(i, false); 
            }
        }
        return res;

    }
}