package Bulider;

/**
 * @author
 * @create 2020-09-20 15:43
 */
public class HouseDirector {
    //如果处理建造房子的流程 交给指挥者
    public House constructHouse(HouseBuilder builder){
        builder.buildBasice();
        builder.buildWall();
        builder.buildRoofed();

        return builder.buildHouse();
    }
}
