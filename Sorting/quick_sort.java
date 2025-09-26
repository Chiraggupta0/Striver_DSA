class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int p = partition(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && nums[i] <= pivot) {
                i++;
            }
            while (j >= low && nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }

        swap(nums, low, j); // place pivot correctly
        return j; // return pivot index
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
class quick_sort
{
    public static void main(String args[])
    {
        int[] nums={23,34,43,12,1,2,55,78,0};
        Solution obj = new Solution();
        
        obj.sortColors(nums);

        // print sorted array
        for (int n : nums) 
        {
            System.out.print(n + " ");
        }
    }
}