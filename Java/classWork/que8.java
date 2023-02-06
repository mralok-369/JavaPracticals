package com.company.classWork;
import java.util.Arrays;

public class que8 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Size of longest increasing continuous subsequence: " + longest_seq(arr));
    }
    public static int longest_seq(int[] arr) {
        int max_sequ = 0;
        if (arr.length == 1) return 1;
        for (int i=0; i<arr.length-1; i++) {
            int count = 1;
            int j = i;
            if (arr[i+1] > arr[i]) {
                while (j<arr.length-1 && arr[j+1]>arr[j]) {
                    count++;
                    j++;
                }
            } else if (arr[i+1]<arr[i]) {
                while (j<arr.length-1 && arr[j+1]<arr[j]) {
                    count++;
                    j++;
                }
            }
            if (count > max_sequ) {
                max_sequ = count;
            }
            i += count-2;
        }
        return max_sequ;
    }
}
