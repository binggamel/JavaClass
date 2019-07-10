package org.dimigo.inheritance;

public class Student extends Person {
   private String studentid;

    public Student(String name, int age, int height, int weight, String studentid) {
       super(name,age,height,weight); //super():는 자동 추가
        this.studentid = studentid;
    }

    public void exam() {
       System.out.println(super.getName() + "이 시험을 본다~!");
   }

   public void study(){
       System.out.println(super.getName() + "이 공부를 한다~!"); //super생략 가능 -> 부모한테만 있는거니까!
   }

    @Override
    public String toString() {
        return "Student{" +
                "studentid ='" + studentid + '\'' +
                super.toString();
    }
}
