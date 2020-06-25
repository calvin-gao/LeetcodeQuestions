package Problems.Strings;
import java.util.*;

public class validPalindrome {
    public boolean isPalindrome(String s) {
        if (s == ""){
            return true;
        }
        
        String alphaNum = "";
        
        for (char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                alphaNum += c;
            }
        }
        
        alphaNum = alphaNum.toLowerCase();
        
        int i = 0;
        int j = alphaNum.length()-1;
        
        while (i <= j){
            if (alphaNum.charAt(i) != alphaNum.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}