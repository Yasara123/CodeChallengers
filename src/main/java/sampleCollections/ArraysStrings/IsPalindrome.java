package sampleCollections.ArraysStrings;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if(s==null ) return false;
        if(s.length()==1|| s.isEmpty())return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left) != s.charAt(right)){
                if(s.charAt(left)<'A'||!((int)s.charAt(left)>='A' &&(int)s.charAt(left)<'a' &&((int)s.charAt(left) == (int)s.charAt(right)-32) || ((int)s.charAt(left)>='a' && (int)s.charAt(left) == (int)s.charAt(right)+32)))
                {
                    return false;
                }
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbad"));
    }
}
