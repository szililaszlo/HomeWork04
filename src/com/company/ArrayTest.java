package com.company;

public class ArrayTest {
    //adatagok
    private int[] array;

//konstruktor
    public ArrayTest() {
        array = new int[20];
        initArray();
    }

//metódus mely feltölti a tömböt
    private void initArray() {
        //aktuális generált elem tárolására szolgáló változó
        int actual;
        for (int i = 0; i < array.length; i++) {
            actual = (int) (Math.random() * (20 + 10 + 1) - 10);
            array[i] = actual;
        }
    }

    //tömb kiíratása
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //metódus mely megkeresi a másodk legnagyobb elemet a tömben és visszatér vele
    public int getSecondHighest() {
        //kellően alacsony értékadás
        int max = -1111111;
        int secondMax = -1111111;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] < max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}
