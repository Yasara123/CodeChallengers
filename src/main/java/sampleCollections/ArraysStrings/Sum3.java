package sampleCollections.ArraysStrings;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                Set<Integer> seen = new HashSet<>();
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = - nums[i] - nums[j];
                    if (seen.contains(complement)) {
                        res.add(Arrays.asList(nums[i], nums[j], complement));
                        while (j + 1 < nums.length && nums[j] == nums[j + 1])
                            ++j;
                    }
                    seen.add(nums[j]);
                }
            }
        }
        return res;
    }

    //public static List<List<Integer>> threeSum(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    if(nums.length<3) return result;
//    CopyOnWriteArraySet<Integer> l = new CopyOnWriteArraySet<>();
//    for (int num : nums) {
//        l.add(num);
//    }
//
//    for (int num : nums) {
//        int remain = k - num;
//        l.remove(num);
//        for (Integer j : l) {
//            int v = remain - j;
//            if (l.contains(v)) {
//                result.add(Arrays.asList(num, j, v));
//                l.remove(j);
//                l.remove(v);
//            }
//        }
//    }
//    return result;
//}
    public static void main(String[] args) {
        int[] in = {-2,0,0,2,2};
        List<List<Integer>> result = threeSum(in);
        for (List<Integer> l : result) {
            for (Integer i : l) {
                System.out.print(i + ",");
            }
            System.out.println("");
        }
    }
}
