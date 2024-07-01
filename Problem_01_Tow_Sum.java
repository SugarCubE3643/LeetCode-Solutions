// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
 

// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

// Solution 1 [JAVA]
// Brute Force Solution
// Time Complexity: O(n^2) //Because of nested loop
// Space Complexity: O(1) // As there are fixed number of data structures in use

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Iterating over each pair through nested loops
        for(int i = 0; i < nums.length; ++i){
            for(int j = i+1; j < nums.length; ++j){
                if(nums[i]+nums[j] == target) return new int[] {i,j};
            }
        }
        return new int[] {};
    }
}


// Solution 2 [JAVA]
// Intuitive solution
// Time Complexity: O(n) // As there are two separate loops
// Space Complexity: O(1) // As there are fixed number of data structures in use

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Creating a hashmap which will store the nums[i] as key and i as the value
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int[] result = new int[2];

        // Feeding the array to hashmap
        for(int i = 0; i < nums.length; ++i){
            hMap.put(nums[i], i);
        }
        
        // Checking if the difference between target and current number is present as a key in the hashmap which is not the current key
        // and returning the current index with the index of the difference key
        for(int i = 0; i < nums.length; ++i){
            if(hMap.containsKey(target - nums[i]) && hMap.get(target - nums[i]) != i){
                result[0] = i;
                result[1] = hMap.get(target - nums[i]);
            }
        }
        return result;
    }
}

// Solution 3 [GO]
// Highly optimised solution
// Now Rust and Go have very high execution speeds on leetcode which will give you the least runtime (0ms) and memory used (4-5 MB)
// I'll separately update these solutions after reaching a target of 500 leetcode problems solved 
