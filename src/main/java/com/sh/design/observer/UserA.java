package com.sh.design.observer;

public class UserA implements Observer {

    private Subject subject;
    private String news;

    public UserA(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String news) {
        this.news = news;
        print();
    }

    void print() {
        System.out.println("A : " + news);
    }
}
