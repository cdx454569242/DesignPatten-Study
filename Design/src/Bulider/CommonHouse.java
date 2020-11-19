package Bulider;

/**
 * @author
 * @create 2020-09-20 15:40
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasice() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子造墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子盖屋顶");
    }
}
