package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //String으로 문자열 계속 생성
        String str = "디미고";
        str +="2학년 ";
        str +="4반 ";
        str +="박태훈"; //문자열 4개 만들어짐...


        //StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("4반 ").append("박태훈");
        System.out.println(sb.toString());

        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc"; //매우느림
        StringBuffer sb = new StringBuffer(str); //좀더 빠름
        StringBuilder sb2 = new StringBuilder(str);  //훨신 더 빠름

        for( int i = 0 ; i < 10000000 ; i ++ ){
//            str +="def"; //1899
            sb.append("def");  //6
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
