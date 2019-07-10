package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유", 25,160,45);
        System.out.println(p);

        p.eat();
        p.sleep();

        Student s = new Student("김수겸",18,180,75,"17405");
        System.out.println(s);
        s.study();
        s.exam();
        s.eat();
        s.sleep();

        Teacher t = new Teacher("지은혜",28,165,50,"컴퓨터네트워크");
        System.out.println(t);
        t.teach();
        t.doTask();
        t.eat();
        t.sleep();

    }
}
