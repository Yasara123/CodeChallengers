package sampleCollections.DynamicPrograming;
//Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
//
//        Example 1:
//
//        Input: "(()"
//        Output: 2
//        Explanation: The longest valid parentheses substring is "()"
//        Example 2:
//
//        Input: ")()())"
//        Output: 4
//        Explanation: The longest valid parentheses substring is "()()"
import java.util.Stack;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {

        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int result = 0;

        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == '(')
                stk.push(i);
            else
            {
                stk.pop();
                if (!stk.empty()) {
                    result = Math.max(result, i - stk.peek());
                } else {
                    stk.push(i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("))()())"));
    }
}
