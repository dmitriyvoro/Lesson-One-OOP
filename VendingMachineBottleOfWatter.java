import java.util.List;

public class VendingMachineBottleOfWatter implements VendingMachine {
    
    private List<Product> productList;// сохранение исходных продуктов

    @Override
    public void initProducts(List<Product> productList) {// инициализирует список с продуктами, на вход принимает список
                                                         // с продуктами
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) // если имя полученное такоеже как у параметра метода
                return product;
        }
        return null;
    }

    // перегруз
   

    @Override
    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWatter) product).getVolume() == volume) 
                return product;
        }
        return null;
    }

 
    

    @Override
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWatter) product).getVolume() == volume
                    && ((HotDrink) product).getTemperature() == temperature)
                return product;
        }
        return null;
    }


    
}
