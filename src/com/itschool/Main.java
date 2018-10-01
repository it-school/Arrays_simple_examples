package com.itschool;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*
        int i[]={1, 3, 5};

        System.out.println(Arrays.toString(i));


        // Создаем два массива
        int[] a1 = new int[10];
        int[] a2 = new int[10];
// заполняем их девятками
        Arrays.fill(a1, 9);
        Arrays.fill(a2, 9);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println("Сравним: " + Arrays.equals(a1, a2));
        System.out.println(a1 == a2);
        a1 = a2;
        a1[0] = 5;
        System.out.println(Arrays.toString(a2));
        System.out.println("Сравним: " + Arrays.equals(a1, a2));

        System.out.println(a1 == a2);

        int size = 10;
        int pithagor_table[][]=new int[size][size];
        for (int row=1; row<=size; row++)
        {
            for (int column=1; column<=size; column++)
            {
                pithagor_table[row-1][column-1]=row*column;
                System.out.print(pithagor_table[row-1][column-1]+"\t");
            }
            System.out.println();
        }

        for (int j = 0; j < size; j++)
            System.out.println(Arrays.toString(pithagor_table[j]));

*/
        // провернуть элементы вектора на К шагов
        // 0123456789
        // К = 3
        // 3456789012

        final int size = 10;
        int array[] = new int[size];  // создали массив

        for (int i = 0; i < size; i++) // проинициализировали массив
            array[i] = i;

        System.out.println(Arrays.toString(array));

        int k = 4;

        ArrayShift(array, k);  // вызвали ф-ция сдвига на К позиций по кругу

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);  // Сортировка массива
        System.out.println(Arrays.toString(array));

        int size2 = 1000000;
        int a[] = new int[size2];
        Random r = new Random();
        for (int i = 0; i < size2; i++) {
            a[i] = r.nextInt(1000000);
        }
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));

        System.out.println("1000 is at the " + Arrays.binarySearch(a, 1000) + " position");

        System.out.println( a.hashCode());
        System.out.println( array.hashCode());

        String s1="password";
        System.out.println(s1.hashCode());
        String s2="password";
        System.out.println(s2.hashCode());
    }

    public static void ArrayShift(int array[], int k)
    {
        int temp;
        for (int j = 0; j < k; j++)
        {
            temp = array[0];
            for (int i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];

            array[array.length - 1] = temp;
        }
    }
}
