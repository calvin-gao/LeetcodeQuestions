package Problems.Strings;
import java.util.*;

/*Valid anagram

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

public class anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false; // return
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