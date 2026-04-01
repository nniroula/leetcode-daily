
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        //create a HashMap to hold element frequency count
        // if count > length/2 - return that key
        //first, decided the length/2 // input = [3, 2, 3]
       int majorityElem = -1;
       HashMap<Integer, Integer> hm = new HashMap<>();
       int halfLen = nums.length/2;
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                //get the value assoicated with that key and increment by 1
               // int value = hm.get(nums[i]); // value might be null - so use getOrDefault()
                //increment the value by 1
                hm.replace(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }else{
                hm.put(nums[i], 1);
            }
       }
       System.out.println(hm);

       //key comes from an array
        for(int i = 0; i < nums.length; i++){
            if(hm.getOrDefault(nums[i], 0) > halfLen){
                majorityElem = nums[i];
                break;
            }
        }
        return majorityElem;
    }
}


public class MajorityProblem{
    public static void main(String[] args) {
        Solution solObj = new Solution();
        int[] nums1 = {3, 2, 3};
        int majorityElem = solObj.majorityElement(nums1);
        System.out.println(majorityElem);
    }

}