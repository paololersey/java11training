package questions.model;

public class Customer {
 
    private String name;
    private String size;

    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString(){
        return getName() + getSize();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
