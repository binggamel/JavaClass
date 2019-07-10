package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {

        //primitive 기본형 타입 배열
        //int, float, double, char, boolean, byte, long, short

        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);


        int[] intArr2 = {1,2,3,4,5}; //c에서도 가능하다~  new int[]를 추가해도 된다~ 안써도 된다~
        printArray(intArr2);


        //double[5]
        double[] doubleArr = new double[5];
        printArray(doubleArr);


        //참조형 타입 배열 -> null로 초기화될뿐!
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";
        printArray(strArr);

        String[] strArr2 = {"김남준","민윤기","정호석"}; //c에서도 가능하다~  new String[]를 추가해도 된다~ 안써도 된다~
        printArray(strArr2);



        //Book 타입배열 2개짜리 생성
        //Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("미생","김재영",100);
        bookArr[1] = new Book("자바를 자바라","전유원",300);
        printArray(bookArr);




        //배열 사용시 주의사항!!
        int[] intArr3 = new int[3]; //null로 초기화하면 nullpoint 에러뜸
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]); // 최대 인댁스

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]); //null
        System.out.println(strArr3[0].length()); //nullpointexception

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]); //null
        System.out.println(bookArr3[0].getTitle());



    }

    private static void printArray(int[] intArr){
        for( int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println("");
    }

    private  static void printArray(double[] doubleArr){
        for( double value : doubleArr){
            System.out.print(value + " | ");
        }
        System.out.println("");
    }

    private  static void printArray(String[] strArr){
        for( String value : strArr){
            System.out.print(value + " | ");
        }
        System.out.println("");
    }

    private static void printArray(Book[] bookArr){
        for ( Book value : bookArr){
//            System.out.printf("책 재목: %s, 선생님 : %s, 페이지 수 :%s\n",
//                                value.getTitle(),value.getAuthor(),value.getPage());

            System.out.println(value); // toString을 직접 구현했으면 .toString을 하지 않아도 알아서 찾아서 실행해 준다.

        }

    }
}
