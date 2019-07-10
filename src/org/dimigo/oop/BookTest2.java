package org.dimigo.oop;

public class BookTest2 {

    private static boolean flag;
    private static void compare(){

        int a = 10;
        int b = a;
        System.out.println( a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println( book == book2 ? "true" : "false");

        book.setTitle("수학의 바이블");
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());
    }
    public static void main(String[] args) {
        compare();

        System.out.println("-------------------------------");

        int num = 5 ;
        methodA(num);
        System.out.println(num); // 5 메소드 값 num은 사라지기 때문

        System.out.println("-------------------------------");

        Book book = new Book("word master");
        methodB(book);
        System.out.println(book.getTitle());  //word master

        System.out.println("-------------------------------");

        methodC(book);
        System.out.println(book.getTitle());//생존코딩

        System.out.println("-------------------------------");

        Book book2 = new Book("미생");
        System.out.println(book2.getTitle().length());


    }

    private static void methodC(Book book) {
        book.setTitle("생존코딩");

    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다");
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }

}
