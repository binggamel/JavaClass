package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력
        for(int i = 2 ;  i < 10 ; i ++ ){
            for( int j = 1 ; j < 10 ; j ++){
                System.out.printf("%d * %d = %d\t",i,j,i*j);
            }
            System.out.println("\n");
        }




        //for-each문
        int[] arr = {1,2,3,4,5};

        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.println(arr[i]);
        }

        for( int value : arr){ //arr에 있는 값을 하나 뽑아서 value에 저장
            System.out.println(value);
        }

        String[] BTS = {"SUGA","J-HOPE","RM"};
        for ( String army : BTS ){
            System.out.println(army);
        }





        // 3. while, do while
        Scanner scanner = new Scanner(System.in); //Scanner 클래스에 new 객체 생성
        int menu = 0; // 지역변수 초기회 해주자
        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. 청사");
            System.out.println("2. 아이즈원");
            System.out.println("3. 오마이걸");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

           menu = scanner.nextInt();


           switch (menu){
               case 1:
                   System.out.println("청하를 선택 하셨군요!\n");
                   break;
               case 2:
                   System.out.println("아이즈원을 선택 하셨군요!\n");
                   break;
               case 3:
                   System.out.println("오아이걸을 선택 하셨군요!\n");
                   break;
               case 9:
                   System.out.println("Bye!\n");
                   scanner.close(); //닫아주기~!~!~!
                   break;
               default:
                   System.out.println("* There is not menu *\n3");
                   break;
           }

        }while ( menu != 9 );
    }
}
