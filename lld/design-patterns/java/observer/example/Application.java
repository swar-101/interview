import news.agency.NewsAgency;
import news.channel.NewsChannel;
import news.observer.Observer;

public class Application {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer channel1 = new NewsChannel("CNBC");
        Observer channel2 = new NewsChannel("BBC");

        // Two channels sign up for updates
        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);

        // News Break!
        newsAgency.setNews("Breaking News: Observer Pattern is awesome!");

        // `channel1` decides to take a break from the hype
        newsAgency.removeObserver(channel1);

        // 2nd News Break!
        newsAgency.setNews("Breaking News: Only BBC will get this exclusive scoop.");
    }
}
