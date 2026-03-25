
import java.util.Arrays;

/*
Input: nums = [2,7,11,15], target = 9(sum of two elements) Output: [0,1]

Input: nums = [3,2,4], target = 6 Output: [1,2]

Input: nums = [3,3], target = 6 Output: [0,1]
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indicesArr = new int[2];
        int startIndex = 0;

        while(startIndex < nums.length){
            for(int i = startIndex + 1; i < nums.length; i++){
                if(nums[startIndex] + nums[i] == target){
                    indicesArr[0] = startIndex;
                    indicesArr[1] = i;
                    break;  // break = stop the loop completely.
                            // continue = skip this round, but keep looping.
                }
            }
            startIndex++;
        }
        return indicesArr;
    }
}

public class TwoSum{
    public static void main(String[] args){
        System.out.println("Two Sum...");

        //Instantiate the class
        Solution solObj = new Solution();

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] resultArr = solObj.twoSum(nums, target);
        System.out.println(Arrays.toString(resultArr));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] resultArr2 = solObj.twoSum(nums2, target2);
        System.out.println(Arrays.toString(resultArr2));

        int[] nums3 = {3,3};
        int target3 = 6;
        int[] resultArr3 = solObj.twoSum(nums3, target3);
        System.out.println(Arrays.toString(resultArr3));

    }
}

