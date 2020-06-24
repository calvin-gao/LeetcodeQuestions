package Problems.Strings;
import java.util.*;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        int [] anagram = new int[26];
        for(int i = 0 ; i < s.length(); i++)
        {
            anagram[s.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < t.length() ; i++)
        {
            anagram[t.charAt(i) - 'a']--;
            if(anagram[t.charAt(i) - 'a'] < 0)
            {
                return false;
            }
        }
        return true;
        


    }
    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length())
    //     {
    //         return false;
    //     }
    //     char[] c = s.toCharArray();
    //     char[] c2 = s.toCharArray();

    //     Arrays.sort(c);
    //     Arrays.sort(c2);
    //     return Arrays.equals(c,c2);
    // }
}