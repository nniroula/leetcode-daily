// Q9
/*
Given an integer x, return true if x is a palindrome, and false 
otherwise.
 */

class Solution {
    public boolean isPalindrome(int x){
        //121, 101 1, 11 are palindromes
        boolean palindrome = false;
        String stringVal = Integer.toString(x);

        int startIndex = 0;
        int endIndex = stringVal.length() - 1;
        for(int i = startIndex; i < stringVal.length(); i++){
            if(stringVal.charAt(i) == stringVal.charAt(endIndex)){
                palindrome = true;
                startIndex++;
                endIndex--;
            }else{
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}


public class PalindromeNumber{
    public static void main(String[] args) {
        System.out.println("Palindrome Number");

        //instantiate the class
        Solution solObj = new Solution();
        int num1 = 121;
        boolean result1 = solObj.isPalindrome(num1);
        System.out.println(result1);

        int num2 = 10;
        boolean result2 = solObj.isPalindrome(num2);
        System.err.println(result2);
    }

}