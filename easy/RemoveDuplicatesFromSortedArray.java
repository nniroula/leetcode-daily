
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums){
        //nums array is sorted one - so duplicates exist in groups - next element not in group is unique
        //take two pointers but do in place solving
        // i points to the last unique element
        // j traverses through the array
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicatesSecond(int[] nums) {
        int uniqueElemsCount;
        //implement hashSet for uniqueness and return the size
        Set<Integer> hs = new HashSet<>();
        
        for(int num: nums){
            hs.add(num);
        }
        
        for(int elem: hs){
            System.out.println("HS elem is " + elem);
        }
        

        //count elements in the hashset
        uniqueElemsCount = hs.size();

        return uniqueElemsCount;
    }
}

public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        Solution solObj = new Solution();
        int[] nums1 = {1, 1, 2};
       int uniqueElemCount = solObj.removeDuplicates(nums1);
       System.out.println("Unique elem count: " + uniqueElemCount);
    }
}