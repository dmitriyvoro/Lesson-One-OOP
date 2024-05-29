import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Product> productList = new ArrayList<>();
      Product product1 = new BottleOfWatter("1", 1, 2131);
      Product product2 = new BottleOfWatter("2", 2, 2);
      Product product3 = new BottleOfWatter("3", 3, 3);
      Product product4 = new BottleOfWatter("4", 4, 4);
      Product product5 = new BottleOfWatter("5", 5, 5);
      Product product6 = new HotDrink("6", 7, 6, 6);
      Product product7 = new HotDrink("7", 7, 7, 7);
      productList.add(product1);
      productList.add(product2);
      productList.add(product3);
      productList.add(product4);
      productList.add(product5);
      productList.add(product6);
      productList.add(product7);

      VendingMachine vendingMachine = new VendingMachineHotDrink();
      vendingMachine.initProducts(productList);// засунули товар в вендинговый автомат
      System.out.println(vendingMachine.getProduct("1"));
      System.out.println(vendingMachine.getProduct("2", 2));
      System.out.println(vendingMachine.getProduct("6", 6, 6));
      System.out.println(vendingMachine.getProduct("7", 7, 7));

   }
}