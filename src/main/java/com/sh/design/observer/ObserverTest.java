package com.sh.design.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Newspapers newspapers = new Newspapers();
        UserA userA = new UserA(newspapers);
        UserB userB = new UserB(newspapers);
        newspapers.changeNews("News Total");
        newspapers.removeObserver(userB);
        newspapers.changeNews("News Second");
        newspapers.removeObserver(userA);
        newspapers.registerObserver(userB);
        newspapers.changeNews("News Three");
    }
}
