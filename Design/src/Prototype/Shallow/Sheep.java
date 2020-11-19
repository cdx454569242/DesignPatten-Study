package Prototype.Shallow;

import java.util.Objects;

/**
 * @author
 * @create 2020-09-19 19:24
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    //克隆改实例 使用默认的clone方法来完成
    @Override
    protected Object clone(){
        try {
            return super.clone();
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return null;
    }
}
