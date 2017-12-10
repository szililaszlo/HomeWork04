package com.company;

public class ArrayTest {
    //adatagok
    private int[] array;
    private int[][] matrix;

    //konstruktor
    public ArrayTest() {
        array = new int[20];
        matrix = new int[5][5];
        initArray();
        initMatrix();
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

    //két dimenziós tömb generálás
    //i a sor
    //j az oszlop
    private void initMatrix() {
        int actual;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //radnom érték 1 és kettő között
                actual = (int) (Math.random() * 2);
                matrix[i][j] = actual;
            }

        }
    }

    //mátrix kiíratás sortörésekkel, 5 sorhosszúságú mátrixra optimaéizálva
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j==4) {
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }

    public void searchNotNullRows() {
        //segédváltozó mely a figyeli hogy a mátrixot hogy minden sor tartalmaz-e nullát
        boolean noZeroLines = true;
        for (int i = 0; i < matrix.length; i++) {
            //változó mely jelzi ha van nulla a sorban
            boolean isNull = false;
            for (int j = 0; j < matrix[i].length; j++) {
                ///ha a mátrix egy adott eleme null értékű akkor igazzá válik az érték
                if (matrix[i][j]==0) {
                    isNull = true;
                }

                //ha a sor utolsó eleme van soron ami nem nulla és a segádváltozó értéke...
                // ..még minig false akkor kiírja h nincs nulla a sorban
                else if( j==4 && isNull==false) {
                    System.out.println("A(z) " + (i+(int)1) +" sorban nincsen nullás elem!");
                    //ha ez lefut biztos lesz olyan sor amiben nincs nulás elem
                    noZeroLines = false;
                }
            }
        }
        // mátrix sorainak ellenőrzése, hogy van-e nullát nem tartalmazó sor
        if(noZeroLines)
            System.out.println("Nem található olyan sor a mátrixban mely ne tartalmazna nullát!");
    }
}
