package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 7, 4, 5, 6,}, {7, 8, 9, 0}};
        int max = array[0][0];
        for (int i = 0; i < array[0].length + array[1].length; i++) {
            if (i < array[0].length) {
                if (max < array[0][i]) {
                    max = array[0][i];
                }
            }
            if (i > array[0].length) {
                if (max < array[1][i - array[0].length]) {
                    max = array[1][i - array[0].length];
                }
            }
        }
        System.out.println("gia tri lon nhat  = "+max);
    }
}
