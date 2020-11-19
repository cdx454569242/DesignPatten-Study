package Facade.Function;

/**
 * @author
 * @create 2020-09-22 9:04
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("爆米花机打开");
    }

    public void off(){
        System.out.println("爆米花机关闭");
    }

    public void play(){
        System.out.println("爆米花机播放");
    }
}
