package SmallestDevisionString;

public class SmallestDevisionString {
    static int findSmallestDivisor(String s, String t) {
        if(s==null || t== null) return -1;
        if(s.length() < t.length()||s.length() % t.length() > 0)
            return -1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i*t.length() < s.length();i++) {
            sb.append(t);
        }
        if(!sb.toString().equals(s))
            return -1;
        int divisible = 1;
        for(int i=1;i<=t.length();i++) {
            if(t.length()%divisible++ != 0) {
                continue;
            }


            sb = new StringBuilder();
            String subStr = t.substring(0, i);
            while(sb.length() < t.length()) {
                sb.append(subStr);
            }
            if(sb.toString().equals(t))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        //String s = "bcdbcdbcdbcd", t = "bcdbcd";
        //String s = "bcdbcdbcd", t = "bcdbcd";
        String s = "lrbblrbb", t = "lrbb";
        //String s = "lrbb", t = "lrbb";
        System.out.println(findSmallestDivisor(s, t));
    }
}

