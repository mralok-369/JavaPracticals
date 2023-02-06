package com.company.DSA;
import java.util.Stack;

public class StringReverse {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars){
            stack.push(c);
        }
        for (int i=0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }

    // main method
    public static void main(String[] args) {
        String str = "ABCDE";
        System.out.println("Before Reverse : "+str);
        System.out.println("After Reverse : "+reverseString(str));
    }
}
