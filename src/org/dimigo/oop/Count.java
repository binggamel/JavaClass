package org.dimigo.oop;

public class Count {

    private  static int cnt; //초기값 0

    public Count(){
        cnt++;
    }

    public static int getCnt(){
        return cnt;
    }

}
