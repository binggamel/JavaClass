package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        //int타입 2차원 배열
        int[][] intArr = new int[2][3]; //0으로 초기화
        printArr(intArr);


        intArr[0][2] = 1;
        intArr[1][1] = 2;


        //String타입 2차원배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];

        strArr[0][0] = "C";
        strArr[0][1] = "JAVA";
        strArr[0][2] = "PHP";
        strArr[1][0] = "C#";
        strArr[1][1] = "Python";

        printArr(strArr);

        String[][] strArr2 = {
                {"C","JAVA","PHP"},
                {"C#","python"}
        };


        String[][] strArr3 = new String[][]{
                {"C","JAVA","PHP"},
                {"C#","python"}
        };

        String[][] strArr4 = {
                new String[] {"C","JAVA","PHP"},
                new String[] {"C#","python"}
        };

        String[][] strArr5 = new String[][]{
                new String[] {"C","JAVA","PHP"},
                new String[] {"C#","python"}
        };
    }

    private static void printArr(String[][] strArr) {
        for(String[] arr : strArr ){
            for(String value : arr ){
                System.out.print(value + "|");
            }
            System.out.println("");
        }
    }

    private static void printArr(int[][] intArr) {
        //이중 for문 출력
//        for(int i = 0 ; i < intArr.length ; i ++ ){
//            for(int j = 0 ; j < intArr[i].length ; j ++){
//
//                System.out.print(intArr[i][j] + "|");
//
//            }
//            System.out.println("");
//        }

        for(int[] arr : intArr ){
            for(int value : arr ){
                System.out.print(value + "|");
            }
            System.out.println("");
        }
    }


}
