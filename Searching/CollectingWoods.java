package Solving_Problems_using_java.Searching;

import java.util.Arrays;

/*
* There are n trees in a forest. The heights of the trees is stored in array tree[], where tree[i] denotes the height of the ith tree in the forest. If the ith tree is cut at a height H, then the wood collected is tree[i] - H, provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k, find the height H at which every tree should be cut (all trees have to be cut at the same height). If it is not possible then return -1 else return H.

Example 1:

Input:
n = 5, k = 4
tree[] = {2, 3, 6, 2, 4}
Output: 3
Explanation: Wood collected by cutting trees
at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
hence 3 is to be subtracted from all numbers.
Since 2 is lesser than 3, nothing gets
subtracted from it.
Example 2:

Input:
n = 6, k = 8
tree[] = {1, 7, 6, 3, 4, 7}
Output: 4
Explanation: Wood collected by cutting trees
at height 4 = 0+(7-4)+(6-4)+0+0+(7-4) = 8
*
* */


public class CollectingWoods {
    public static void main(String[] args) {
        int[] arr = {81 ,13, 36, 65, 38, 69};
        int k = 47;
        Arrays.sort(arr);
        System.out.println(findHeightToBeCut(arr, k, 0, arr[arr.length-1]));
    }

    public static int findHeightToBeCut(int[] arr, int k, int s, int e){
        if(e >= s){
            int mid = s + (e-s)/2;
            int res = 0;
            for(int i = 0; i< arr.length; i++){
                if(arr[i] - mid > 0){
                    res = res + (arr[i] - mid);
                }
            }
            if(res == k){
                return mid;
            }
            else if(res > k){
                return findHeightToBeCut(arr, k, mid+1, e);
            } else if (res < k) {
                return findHeightToBeCut(arr, k, 0, mid-1);
            }
        }

        return -1;

    }
}
