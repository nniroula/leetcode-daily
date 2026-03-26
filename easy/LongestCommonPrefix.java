/*
Write a function to find the longest common prefix string amongst an 
array of strings. If there is no common prefix, return an empty string "".

input = ["flower","flow","flight"], output = fl
input = ["dog","racecar","car"], output = ""
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        String firstElem = strs[0]; // take first element as start prefix string
        // take characters from first elem and compare each one of them with chars from other elems
        // if match found, concatenate to the prefix
        for(int i = 0; i < firstElem.length(); i++){
            char currentChar = firstElem.charAt(i);

            boolean currentPrefix = false;
            for(int j = i + 1; j < strs.length; j++ ){
                String nextArrElem = strs[j];  // strs[j] gives next element in the strs array
                if(nextArrElem.charAt(i) == currentChar){
                    currentPrefix = true;
                }else{
                    currentPrefix = false;
                }
            }
            if(currentPrefix == true){
                prefix+= currentChar;
            }
        }

        return prefix;
    }
}

public class LongestCommonPrefix{
    public static void main(String[] args) {
        System.out.println("Longest Common Prefix...");

        // instantiate the class
        Solution solObj = new Solution();

        // call function
        String[] strArr1 = {"flower","flow","flight"};
        String result1 = solObj.longestCommonPrefix(strArr1);
        System.out.println(result1);

        String[] strArr2 = {"dog","racecar","car"};
        String result2 = solObj.longestCommonPrefix(strArr2);
        System.err.println(result2);
    }
}