package Facade;

/**
 * @author
 * @create 2020-09-22 9:14
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.player();
        homeTheaterFacade.end();
    }
}
