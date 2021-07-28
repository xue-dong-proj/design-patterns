package nuc.edu.bridge;

/**
 * @author 薛东
 * @date 2021/7/22 21:36
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void call(){
        brand.call();
    }

    protected void close(){
        brand.close();
    }
}
