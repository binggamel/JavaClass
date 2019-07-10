package org.dimigo.inheritance;

public class Person {
    public String name; //+
    protected int age;     //#
    int height;               //~
    private int weight;          //-

    //public +어느곳에서나 접근 가능  protected #같은 패키지 또는 자식 클래스에서 접근 가능       default ~접근제어자를 적지 않음        private -자신의 클래서 내부에서만 접근 가능

    public Person() {};    //기본생성자 자식에서 생성자가 없으면 부모의 자동으로 기본생성자를 추가함 super();

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }



    


    public void eat(){
        System.out.println(name + "이 급식을 먹는다~!");
    }

    public void sleep(){
        System.out.println(name + "이 리잠을 잔다~!");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
