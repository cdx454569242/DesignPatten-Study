package Bulider;

//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasice();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public House buildHouse(){
        return house;
    }
}
