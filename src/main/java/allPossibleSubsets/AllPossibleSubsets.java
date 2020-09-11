package allPossibleSubsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPossibleSubsets {
    static Set<List<Integer>> allPossibles(int arr[])
    {
        Set<List<Integer>> pp =  new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < (1<<n); i++)
        {
            List<Integer> ll =  new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    ll.add(arr[j]);
                }
            }
            pp.add(ll);

        }
        return pp;
    }
    public static void main(String[] args) {
        Set<List<Integer>> pp = allPossibles(new int []{1,2,3});
        for (List<Integer>l : pp){
            if(l.isEmpty())
                System.out.print("null");
            else
                for (Integer i:l){
                    System.out.print(i+" ");
                }
            System.out.println("");
        }
    }
}
