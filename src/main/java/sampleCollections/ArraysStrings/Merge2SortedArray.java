package sampleCollections.ArraysStrings;

public class Merge2SortedArray {
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int len = arr1.length+ arr2.length;
        int [] result = new int[len];
        int idx_arr1 =0;
        int idx_arr2 =0;
        for (int i = 0; i < len ; i++) {
            if(idx_arr1 < arr1.length && idx_arr2 < arr2.length && arr1[idx_arr1] < arr2[idx_arr2]){
                result[i]= arr1[idx_arr1];
                idx_arr1++;
            } else if(idx_arr1 < arr1.length && idx_arr2 < arr2.length && arr1[idx_arr1] >=arr2[idx_arr2]){
                result[i]= arr2[idx_arr2];
                idx_arr2++;
            } else if( idx_arr1 >= arr1.length){
                result[i]= arr2[idx_arr2];
                idx_arr2++;
            }else if( idx_arr2 >= arr2.length){
                result[i]= arr1[idx_arr1];
                idx_arr1++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,5,7,9};
        int [] arr2 = {1,2,3,8,10};
        int [] result = mergeArray(arr1,arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
}
