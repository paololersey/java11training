package questions.model;

public class Clothing implements Comparable<Clothing> {
 
    private String description;
    private String size;
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return getDescription() + getSize();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.getDescription());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
