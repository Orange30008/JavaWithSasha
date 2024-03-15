package ru.sanyaprepod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int a = 10;
        int b = 5;
        System.out.println("Задание 1");
        System.out.println("Cумма лежит в пределах от 10 до 20? " + sumBeth1020(a, b));
        //Задание 2
        a = -10;
        System.out.println("Задание 2");
        printPosOrNeg(a);
        //Задание 3
        a = -10;
        System.out.println("Задание 3");
        System.out.println(returnTrueNeg(a));
        //Задание 4
        String name = "Александр Кортунов";
        System.out.println("Задание 4");
        helloName(name);
        //Задание 5
        System.out.println("Задание 5");
        int[] zeroone = {0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1};
        System.out.println(Arrays.toString(zeroone));
        //ну вроде как в уроке этого не было, но посмотреть на массив то надо в строке
        for (int i = 0; i < zeroone.length; i++) {
            if (zeroone[i] == 0) {
                zeroone[i] = 1;
            } else {
                zeroone[i] = 0;
            }
        }
        System.out.println(Arrays.toString(zeroone));
        //Задание 6
        System.out.println("Задание 6");
        int[] prostoMassiv = new int[8];
        System.out.println(Arrays.toString(prostoMassiv));
        for (int i = 0; i < prostoMassiv.length; i++) {
            prostoMassiv[i] = 2 + i * 3;
        }
        System.out.println(Arrays.toString(prostoMassiv));
        //Задание 7
        System.out.println("Задание 7");
        int[] VolanDeMort = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(VolanDeMort));
        for (int i = 0; i < VolanDeMort.length; i++) {
            if (VolanDeMort[i] < 6) {
                VolanDeMort[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(VolanDeMort));
        //Задание 8
        System.out.println("Задание 8");
        int[][] privet = new int[6][6];
        System.out.println(Arrays.deepToString(privet));
        int row = privet.length;

        for (int i = 0; i < privet.length; i++) {
            for (int j = 0; j < privet.length; j++) {
                if (i == j) {
                    privet[i][j] = 1;
                } else if (row - j == i + 1) {
                    privet[i][j] = 1;
                }
            }

        }
        /*
        Тут тоже не уверен что можно сделать лучше, заманался за весь день((  первое что пришло в голову
         */
        System.out.println(Arrays.deepToString(privet));
        //Задание 9
        System.out.println("Задание 9");
        int[] arrMaxMin = {9, 1, 3, 4, 5, 6, 4, 6, 67, 3, 6, 3, 2, 2, 6, 5454, 34, 3, 345, 5, 456, 43, 534, 346, 6, 74, 2};
        int max = arrMaxMin[0];
        int min = arrMaxMin[0];
        System.out.println(Arrays.toString(arrMaxMin));
        for (int i = 0; i < arrMaxMin.length; i++) {
            if (arrMaxMin[i] > max) {
                max = arrMaxMin[i];

            } else if (arrMaxMin[i] < min) {
                min = arrMaxMin[i];
            }
        }
        System.out.println("Максимальное - " + max + "\nМинимальное - " + min);
        //Задание 10
        System.out.println("Задание 10");
        int year = 2012;
        whatYearNow(year);
        //Задание 11
        System.out.println("Задание 11");
        int[] arrProrokSunBoy = {10, 2, 1, 1, 1, 2, 0, 0, 11};
        System.out.println(Arrays.toString(arrProrokSunBoy));
        checkBalance(arrProrokSunBoy);
        System.out.println("Центр масс в заданом массие - " + checkBalance(arrProrokSunBoy));
    }


    public static boolean sumBeth1020(int a, int b) {

        return a + b >= 10 && a + b <= 20;

    }

    public static void printPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean returnTrueNeg(int a) {
        return a < 0;
        /*
        тут максимально не уверен, потому что в задании написано однозначно "ЕСЛИ МЕНЬШЕ 0,
        ОТПРАВИТЬ ТРУ", и звучит это будто в простивном случае ничего не возвращать, но
        разве можно ли возвращающий метод оставлять в состоянии невозврата? пробовал
        через if() {} else {break или continue}, но ничего не работало))
        */
    }

    public static void helloName(String a) {
        System.out.println("Привет, " + a + "!");
    }

    public static void whatYearNow(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static boolean checkBalance(int[] arr) {
        int left = arr[0];
        int right = arr[arr.length-1];
        int j =2;
        int k =1;
        for (int i = 1; i < arr.length-1; i++) {
        if (left>=right){
            right+=arr[arr.length-j];
            j++;
        } else {
            left+=arr[k];
            k++;
        }
        }
        return left==right;
    }
}
