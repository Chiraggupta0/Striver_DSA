// tc-o(n log base2 n)- best ,average and worst all
// sc-0(n) best,average and worst all
import java.util.Vector;

class Solution {
    public void merge(Vector<Integer> arr, int low, int mid, int high) {
        Vector<Integer> temp = new Vector<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
    }

    public void ms(Vector<Integer> arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}

class Merge_sort {
    public static void main(String args[]) {
        Vector<Integer> arr = new Vector<>();
        arr.add(2);
        arr.add(54);
        arr.add(43);
        arr.add(34);
        arr.add(23);
        arr.add(36);
        arr.add(77);
        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(74);
        arr.add(55);
        arr.add(98);
        arr.add(31);
        arr.add(1);

        Solution obj = new Solution();
        obj.ms(arr, 0, arr.size() - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
