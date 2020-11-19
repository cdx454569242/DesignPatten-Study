package Facade.Function;

/**
 * @author
 * @create 2020-09-22 9:00
 */
public class DVDPlayer {
    private DVDPlayer(){

    }
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD打开");
    }

    public void off(){
        System.out.println("DVD关闭");
    }

    public void play(){
        System.out.println("DVD播放");
    }


}
