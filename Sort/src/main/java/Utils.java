/**
 * utils
 *
 * @Author: wujiaji
 * @Date: 2021-07-24
 **/
public class Utils {
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
