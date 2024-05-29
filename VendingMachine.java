import java.util.List;

//конструктор не нужен потому что есть метод initProducts, он выполняет в себе роль конструктора
public interface VendingMachine {

    void initProducts(List<Product> productList);
   
    Product getProduct(String name); 
    Product getProduct(String name, double volume);
    Product getProduct(String name, double volume, int temperature);
}
