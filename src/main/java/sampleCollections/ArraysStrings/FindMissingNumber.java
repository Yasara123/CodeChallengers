package sampleCollections.ArraysStrings;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,3,5,6,7};
       System.out.println(missingNumber(nums));
    }
}
