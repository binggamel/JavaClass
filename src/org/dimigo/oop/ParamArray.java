package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        add(intArr,10);
        printArry(intArr);//11,12,13,14,15


        String[] names = {"홍길동","홍길서","홍길남","김길북"};
        changeName(names);
        printArry(names);
    }

    private static void changeName(String[] names) {
        for(int i = 0 ; i < names.length ; i++ ){
            names[i] = "김" + names[i].substring(1);
        }
    }

    private static void printArry(String[] names){
        for(String value : names){
            System.out.print(value + "|");
        }

    }

    private static void add(int[] intArr, int a){
        for( int i = 0 ; i < intArr.length ; i ++ ){
            intArr[i] = intArr[i] + 10 ;

        }
    }

    private static void printArry(int[] intArr){
        for(int value : intArr){
            System.out.print(value + "|");
        }
    }

}
