import java.util.HashMap;

public class hard9 {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        int repeating = -1, missing = -1;

        // Step 1: Count frequency of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find repeating and missing
        for (int i = 1; i <= n; i++) {
            if (freq.containsKey(i)) {
                if (freq.get(i) == 2) {
                    repeating = i;
                }
            } else {
                missing = i;
            }
        }

        // Step 3: Return result
        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 1, 1};
        int[] result = findMissingRepeatingNumbers(nums);

        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
