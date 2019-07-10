package org.dimigo.oop;

public class Book{
    // 필드 선언
    private String title = "Word Master";
    private String author = "이투스북";
    private int page = 300;

    //기본 생성자
    public Book(){
        System.out.println("기본 생성자 호");
    }


    //추가 생성자   추가생성자를 하나라도 넣어준 경우에는 기본생성자를 넣어주지 않는다 -> 기본 생성자를 넣어주자...
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title,author,0);
    }

    public Book(String title) {
        this(title, "저자미상");
    }


/*

    //getter
    public String getTitle(){
        return title;
    }

    public  String getAuthor(){
        return author;
    }

    public int getPage(){
        return page;
    }


    //setter
    public void setTitle(String title){
        this.title = title; // this. -> 자기 자신을 의
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPage(int page){
        if( page > 0 ) {
            this.page = page;
        }
    }
*/


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

//    public  String toString() {
//        return  "책제목: " + title +
//                ",저자명 : "+  author +
//                ", 페이지 수 : " + page;
//    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                ", author='" + author +
                ", page=" + page +
                '}';
    }
}
