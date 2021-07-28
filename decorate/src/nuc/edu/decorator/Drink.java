package nuc.edu.decorator;

/**
 * @author 薛东
 * @date 2021/7/23 16:09
 */
public abstract class Drink {
    public String description;

    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
