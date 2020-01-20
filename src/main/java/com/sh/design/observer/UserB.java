package com.sh.design.observer;

public class UserB implements Observer {

    public UserB(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String news) {
        System.out.println("B : " + news);
    }
}
