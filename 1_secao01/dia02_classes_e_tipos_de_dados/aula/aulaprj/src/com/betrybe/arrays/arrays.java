package com.betrybe.arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arrayDeInteiros = new int[9];
        int[] newArrays = {1,2,3,4,5,6,767,8,8,9,9,9};
        int[][] matriz = new int[2][10];
        String[] arrayDeString = new String[10];

        matriz[0][0] = 10;
        matriz[1][0] = 20;

        arrayDeString[0] = "Na Trybe";
        arrayDeString[1] = "eu aprendo Java";

        System.out.println(newArrays[3]);
        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][5]);
        System.out.println("Length: " + arrayDeString.length);

        arrayDeInteiros[0] = 40;
        arrayDeInteiros[1] = 55;
        arrayDeInteiros[2] = 63;
        arrayDeInteiros[3] = 17;
        arrayDeInteiros[4] = 22;
        arrayDeInteiros[5] = 68;
        arrayDeInteiros[6] = 89;
        arrayDeInteiros[7] = 97;
        arrayDeInteiros[8] = 89;

        System.out.println(arrayDeInteiros[8]);
        System.out.println(arrayDeInteiros[2]);
//        arrayDeInteiros[9] = 89;
    }
}
