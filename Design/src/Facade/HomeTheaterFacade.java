package Facade;

import Facade.Function.DVDPlayer;
import Facade.Function.Popcorn;
import Facade.Function.Projector;

/**
 * @author
 * @create 2020-09-22 9:15
 */
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.play();

        dvdPlayer.on();
        dvdPlayer.play();

        projector.on();
        projector.play();

    }

    public void player(){
        dvdPlayer.play();
    }

    public void end(){
        popcorn.off();
        dvdPlayer.off();
        projector.off();
    }
}
