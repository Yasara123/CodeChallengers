package sampleCollections.ArraysStrings;
//Given a string, find the length of the longest substring without repeating characters.
//
//         Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if(s== null || s.isEmpty()) return 0;
        List<Integer> lengths = new ArrayList<Integer>();
        for (int j = 0; j < s.length(); j++) {
            int i;
            List<Character> contained = new ArrayList<Character>();
            for (i = j; i < s.length(); i++) {
                if (contained.contains(s.charAt(i))) {
                    break;
                }
                contained.add(s.charAt(i));
            }
            lengths.add(i-j);
        }
        return Collections.max(lengths);
    }

    public int lengthOfLongestSubstringOpt(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
