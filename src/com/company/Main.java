package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

//     Human grandfather = new Human("Александр", true, 88);
//     Human grandfather1 = new Human("Сергей", true, 78);
//     Human grandmother = new Human("Валентина", false, 80);
//     Human grandmother1 = new Human("Ирина", false, 77);
//     Human father = new Human("Николай", true, 33, grandfather, grandfather);
//     Human monther = new Human("Наталья", false, 34, grandfather1, grandmother1);
//     Human junior = new Human("Владимир", true, 14, father, monther);
//     Human junior1 = new Human("Света", false, 19, father, monther);
//
//        System.out.println(grandfather.toString());
//        System.out.println(grandfather1.toString());
//        System.out.println(grandmother.toString());
//        System.out.println(grandmother1.toString());
//        System.out.println(father.toString());
//        System.out.println(monther.toString());
//        System.out.println( junior.toString());
//        System.out.println(junior1.toString());
//        String[] array = initializeArray();
//        System.out.println(Arrays.toString(array));
//        printArray(array);
        int a  = 10;

        String[] srt = new String[10];
        Integer[] intarr = new Integer[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < srt.length; i++){
            String s = reader.readLine();
            srt[i] = s;
        }

        for(int i = 0; i < intarr.length; i++){
            intarr[i] = srt[i].length();
        }

        for(int i = 0; i < intarr.length; i++){
            System.out.println(intarr[i]);
        }
        System.out.println("zalupko");
    }

    private static void printArray(String[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            System.out.println(arr[i]);
             }
    }

    public static String[] initializeArray() throws IOException {
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            arr[i] = reader.readLine();
        }
       return arr;
    }


}
