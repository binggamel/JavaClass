package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {//배열의 단점 극복, 자바의 컬렉션은 다수의 데이터를 쉽게 처리(추가, 삭제, 변경)할 수 있는 표준화된 방법이다.
    public static void main(String[] args) {
        // 1. List 계열 : ArrayList
//        List list = new ArrayList();
//        list.add("나자바");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//
//        String str = (String) list.get(0);

        //제네릭
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        printList(list);
        list.add(1, "포도");
        printList(list);
        list.set(2,"바나나");
        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();
        printList(list);
    }

    private static void printList(List<String> list) {
        for(String s: list){
            System.out.print(s + "|");
        }
        System.out.println();
    }
}