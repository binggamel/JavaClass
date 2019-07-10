package org.dimigo.Iinterface;

public class BenzEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Benz 앤진 가동");

    }

    @Override
    public void stopEngine() {
        System.out.println("Benz 엔진 멈춤");

    }
}
