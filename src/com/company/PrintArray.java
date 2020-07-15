package com.company;

public class PrintArray {
//    static void printArray(int[] a) {
//        for (int i : a) {
//            System.out.println(a);
//        }
//    }
//
//    static void printArray(String[] b) {
//        for (String i : b) {
//            System.out.println(b);
//        }
//    }
    static  <T> void arrayPrinter (T[] c1){
        for (T c : c1){
            System.out.println(c);
        }
    }
}
