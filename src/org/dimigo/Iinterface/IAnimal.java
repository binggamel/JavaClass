package org.dimigo.Iinterface;


//인터페이스 표준/규약/명세

public interface IAnimal {

    //상수처리 (public static final //상수는 대문자로 나옴
    String FAR_NAME = "디미 동물농장";


    //public abstract 생략 가능! 인터페이스는 추상메소드만 선언 할 수 있기때문
//   public abstract void eat();

   void bark();


    //추상메소드인데 내용이 있으니 default 값을 붙여줌
    //JDK8부터 기능 추가 (디폴트 메소드 추가)
    default public void eat() {

        System.out.println("냠");
    }


    static void welcome(){
        System.out.println(FAR_NAME + "에 오신걸 환영합니다~" );
    }

}

