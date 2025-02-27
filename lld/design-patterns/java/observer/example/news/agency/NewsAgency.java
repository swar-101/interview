package news.agency;

import news.observer.Observer;
import news.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(news);
        }
    }
}
