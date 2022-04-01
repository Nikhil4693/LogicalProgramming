package com.bs.rough;

public class Revision {

    public static void main(String[] args) {
        String str="ankur";
        reverseStringBySwapingElement (str);

    }

    private static void reverseStringBySwapingElement(String str) {
        char[] arr=str.toCharArray ();
        int length=arr.length;

        for (int i = 0; i < length/2; i++) {
            char temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+" ");
        }
    }
}
