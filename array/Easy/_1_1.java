// largest element in an array
// tc- o(nlogn)
//sc-o(1)

import java.util.Arrays;

public class _1_1 {
    static int largest(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 33, 63, 1, 2, 3, 44, 22, 32, 1, 765, 44 };
        int sol = largest(arr);
        System.out.println(sol);
    }

}
