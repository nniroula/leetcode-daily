
import java.util.HashMap;

//leetcode # 166
/*
    Input: nums = [2,2,1] and Output: 1
    Input: nums = [4,1,2,1,2] and Output: 4
 */
class Solution {
    public int singleNumber(int[] nums) {
        int nonRepetativeNum = -1;

        // create a hashMap, save frequency to it and return the key that has count of 1
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                //increment count
                int value = hm.getOrDefault(nums[i], 0);
                hm.replace(nums[i], value + 1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        System.out.println("HashMap ; " + hm);

        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) == 1){
                nonRepetativeNum = nums[i];
            }
        }

              // hm.forEach((k, v) -> {      // forEach(lambda Expr) helps to do some opearions with elements of collection, but not to return any values
        //     if(hm.get(k) == 1){
        //         nonRepetativeNum = k;
        //     }
        // }
        // );
        return nonRepetativeNum;
    }

    public int singleNumberBitManipulation(int[] nums) {
        // propertity of XOR: XORing a number with itself results in 0
        // so the pair numbers cancel them each other and at the end
        // one that is NOT a pair remains
        int singleNum = 0;
        for(int num: nums){ //nums = [4,1,2,1,2], Output: 4
            // XOR with 0 gives the number. singleNum is 0
            singleNum = singleNum ^ num ; // singleNum ^= num
            //System.out.println("bit Num: " + singleNum);
        }

        return singleNum;
    }
}

public class SingleNumber{
    public static void main(String[] args) {
        

        Solution sol = new Solution();
        int[] nums1 = {2,2,1};      // Input: nums = [2,2,1] and Output: 1
        int result1 = sol.singleNumber(nums1);
        System.out.println("Result1: " + result1);

        int nums2[] = {4,1,2,1,2};
        System.out.println("Result2: " + sol.singleNumber(nums2));

        System.out.println("Result3 Bit Manu: " + sol.singleNumberBitManipulation(nums2));
        
    }
}