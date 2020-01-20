package com.sh.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Newspapers implements Subject {

    private List<Observer> list;
    private String news;

    public Newspapers() {
        list = new ArrayList<Observer>();
    }

    public void changeNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = list.indexOf(observer);
        if (index >= 0) {
            list.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(news);
        }
    }
}
