


public class Resource {

    private String name;
    private Double price;
    private int volume;
    private int quantity;

    public Resource(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    Double getPrice() {
        return price;
    }

    int getVolume() {
        return volume;
    }

    int getQuantity() {
        return quantity;
    }

    int setPrice(Double p) {
        price = p;
    }

    int setQuantity(int q) {
        quantity = q;
    }

}