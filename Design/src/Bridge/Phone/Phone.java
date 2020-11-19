package Bridge.Phone;

import Bridge.Brand.Brand;

/**
 * @author
 * @create 2020-09-20 20:14
 */
public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand){
            this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.cloase();
    }

    public void call(){
        this.brand.call();
    }
}
