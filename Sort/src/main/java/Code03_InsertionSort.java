/**
 * InsertionSort
 *
 * @Author: wujiaji
 * @Date: 2021-07-24
 **/
public class Code03_InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Utils.swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 6, 5};
        insertionSort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
