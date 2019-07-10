package org.dimigo.Iinterface;

public class BMWEngine implements IEngine {
    @Override
    public void startEngine() {
        System.out.println("BMW 앤진 가동");

    }

    @Override
    public void stopEngine() {
        System.out.println("BMW 엔진 멈춤");

    }
}
