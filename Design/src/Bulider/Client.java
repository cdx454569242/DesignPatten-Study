package Bulider;

/**
 * @author
 * @create 2020-09-20 15:51
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector();
        House house = houseDirector.constructHouse(commonHouse);

        HighBuilder highBuilder = new HighBuilder();
        House house1 = houseDirector.constructHouse(highBuilder);
    }
}
