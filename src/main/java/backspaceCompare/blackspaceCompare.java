package backspaceCompare;

//Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
//
//        Note that after backspacing an empty text, the text will continue empty.
//
//        Example 1:
//
//        Input: S = "ab#c", T = "ad#c"
//        Output: true
//        Explanation: Both S and T become "ac".
public class blackspaceCompare {
    public static boolean backspaceCompare(String S, String T) {
        //while (S.substring(S.indexOf("#")-1,S.indexOf("#"))
        if(S.length()==1 && T.length()==1 ){
            return S.equals(T);
        }
        for (int i = 1; i <S.length() ; i++) {
            if(S.charAt(i)=='#'){
               S= S.replaceFirst(S.charAt(i-1)+"#","");
               i=0;
            }
        }
        //S= S.replaceFirst("#","");
        for (int i = 1; i <T.length()  ; i++) {
            if(T.charAt(i)=='#'){
                T= T.replaceFirst(T.charAt(i-1)+"#","");
                i=0;
            }
        }
        //T= T.replaceFirst("#","");
        return S.equals(T);
    }
    
    public static void main(String[] args) {
        System.out.println(backspaceCompare(  "e##e#o##oyof##q", "e##e#fq##o##oyof##q"));
    }
}
