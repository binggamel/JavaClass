package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // 1. if else
        // 선거권 연령 : 만 19세
         int age = 17;

         if ( age >= 19 ){
             System.out.println("투표하러 가세요\n");
         } else {
             System.out.println("선거권이 없네요\n");
         }

         // 2. switch
         //자바 스위치 케이스 문에서 String 타입 가능
        // 랜덤값 뽑기

//        System.out.println( new Random().nextInt(6) + 1); //new  객체 생성
        int num = new Random().nextInt(6) + 1;
        System.out.println(num);

        switch ( num % 2 ){
            case 1:
                System.out.println("홀수입니다.\n");
                break;

            case 0:
                System.out.println("짝수입니다.\n");
                break;

            default:
                System.out.println("넌 뭐야;");

        }


        String menu = "치킨";
        switch ( menu ){
            case "치킨":
                System.out.println("오늘 메뉴는 치킨이닭!\n");
                break;
            case "피자":
                System.out.println("피자 선택\n");
                break;
            default:
                System.out.println("다이어트 중!");
        }



    }
}
