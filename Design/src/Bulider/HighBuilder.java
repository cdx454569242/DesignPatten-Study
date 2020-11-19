package Bulider;

/**
 * @author
 * @create 2020-09-20 15:42
 */
public class HighBuilder extends HouseBuilder{

    @Override
    public void buildBasice() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼造墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼盖屋顶");
    }
}
