package Facade.Function;

/**
 * @author
 * @create 2020-09-22 9:06
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪打开");
    }

    public void off(){
        System.out.println("投影仪关闭");
    }

    public void play(){
        System.out.println("投影仪播放");
    }
}
