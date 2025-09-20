// tc-- o(n^2) worst and average tc
// o(n) best tc when array is sorted
class Solution {
    public void Bubble_Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // passes
            int didswap = 0; // reset here for each pass
            for (int j = 0; j < n - i - 1; j++) { // comparisons
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didswap = 1; // mark that swap happened
                }
            }
            // if no swap happened in this pass → already sorted
            if (didswap == 0) break;
        }
    }
}

class Bubble_Sort {
    public static void main(String args[]) {
        Solution obj = new Solution();
        int[] arr = {2, 5, 4, 7, 23, 1, 2, 32, 44, 9};
        
        obj.Bubble_Sort(arr);

        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
