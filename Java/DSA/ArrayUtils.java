package com.company.DSA;

public class ArrayUtils {
    // method to print an array
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // creating an array default value are 0's
    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
//        System.out.println("The length of the array is : " + myArray.length);
//        int[] arr = {1,5,6,8,2,9};
//        printArray(arr);
//        System.out.println("The length of the array is : " + arr.length);
    }
    // reverse an array
    public static void reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // find minimum value of an array
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    // move all zeros to end of the array
    public static void moveZerosToEnd(int[] arr,int n){
        int j = 0;
        for (int i=0; i<n; i++){
            if(arr[i] !=0 && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
        printArray(arr);
    }
    // resize an array
    public static void resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i=0; i< arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    // main function --> driver code (execution of program starts from here)
    public static void main(String[] args) {
        ArrayUtils arrUtil = new ArrayUtils();
        arrUtil.arrayDemo(); // creating an array
        int[] numbers = {2,11,5,10,7,8,1}; // creating another array
        printArray(numbers);  // printing the array
        reverseArray(numbers,0,numbers.length-1); // reversing an array
        printArray(numbers);
        System.out.println("The minimum value of the array is : "+ findMin(numbers)); // finding min value
        int[] mz = {0,2,0,3,0,1,5,0,0,25,3,0,5,0};
        moveZerosToEnd(mz,mz.length);  // move zero to the end
        resizeArray(numbers, numbers.length*2);  // resize an array
    }
}
