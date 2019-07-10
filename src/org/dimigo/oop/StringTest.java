package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //문자열 리터럴 방식
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2); //주소값 비교
        System.out.println(dog1.equals(dog2));//내용 비교

        //new객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));


        //문제
        System.out.println( dog1 == "멍멍이");
        System.out.println( cat1 == "야옹이");

        String id = "admin";

//        if(id.toLowerCase().equals("admin")){  //toLowerCase() 소문자로 바꿔줌
//            System.out.println("관리자");
//        } else {
//            System.out.println("관리자가 아님님"); //널포인트 에러 가능성~!
//       }

        if("admin".equals(id)){
            System.out.println("관리자");
        } else {
            System.out.println("관리자 아님");
        }

        testString();

    }

    private static void testString() {
        //          012 789d123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length()); //14
        System.out.println(s.substring(3)); //defgABCDEFG

        System.out.println(s.substring(3,6)); //def  endindex에서 beginindex를 뺀만큼 출력한다 생각하자!
        System.out.println(s.indexOf("C")); // C -> 9
        System.out.println(s.charAt(9));  //9->C
        System.out.println(s.concat("ABC")); //뒤에다가 문자 붙이기

        System.out.println("              ABC           ".trim()); //스페이스 없이 [ABC]만 출력해보자  공백제거

        System.out.println(s.toUpperCase());  //toUpperCase() 전부 대문자로 바꿔줌
        System.out.println(s.toLowerCase()); //toLowerCase()   전부 소문자로 바꿔줌
        System.out.println(s.replace("a","A")); //특정 문자 바꾸기
        System.out.println(s.startsWith("abc")); //"abc"로 시작하는지 true false 구분
        System.out.println(s.endsWith("FG")); //"FG"로 끝나는지 true false 구분
    }
}
