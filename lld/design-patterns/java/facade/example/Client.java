import facade.HomeFacade;

public class Client {
    public static void main(String[] args) {
        HomeFacade home = new HomeFacade();

        home.startMovie();
        System.out.println("Enjoy your movie!");
        System.out.println("The End");
        home.stopMovie();
    }
}