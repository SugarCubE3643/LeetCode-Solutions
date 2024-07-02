// 09. Palindrome Number
// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1
 

// Follow up: Could you solve it without converting the integer to a string?

// Solution 1 [JAVA]
// Brute Force Solution
// Time Complexity: O(log(n)) // As the number of digits in a number n is proportional to it's log
// Space Complexity: O(1) // AS the amount of variables in use are constant


class Solution {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        int len = xs.length();
        for(int i = 0; i < len; ++i){
            if(xs.charAt(i) != xs.charAt(len-i-1)) return false;
        }
        return true;
    }
}