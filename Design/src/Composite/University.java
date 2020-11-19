package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @create 2020-09-21 19:49
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> list = new ArrayList<>();

    protected University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("---------------"+ getName() +"-------------------");
        for (OrganizationComponent organizationComponent : list){
            organizationComponent.print();
        }
    }
}
