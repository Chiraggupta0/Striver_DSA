import java.util.*;

class Solution {
    // Method to find leaders in an array
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();  // List to store leaders
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;  // assume nums[i] is a leader

            // Check all elements to the right
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    isLeader = false;  // nums[i] is not a leader
                    break;
                }
            }

            if (isLeader) {
                ans.add(nums[i]);  // add leader to the list
            }
        }

        return ans;
    }
}

public class mediumLeaderInAnArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        // Example input
        int[] nums = {16, 17, 4, 3, 5, 2};

        // Call the leaders method
        List<Integer> leadersList = s.leaders(nums);

        // Print the result
        System.out.println("Leaders in the array: " + leadersList);
    }
}
