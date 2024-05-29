public abstract class Product {
    private String name;
    private double cost;


    public Product(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Product{" +
        "name" + name + '\'' +
        ", cost" + cost+
        '}';
    }
}
    
    
