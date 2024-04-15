package week05.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest04 {
    /*
    bir product sınıfı oluşturalım isim ve fiyatı olsun .
    AllArgsConstructor'ı olsun .
    Encapsulation kurallarına uygun bir şekilde hazırlayalım.
     */

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 40000.0));
        productList.add(new Product("Phone", 80000.0));
        productList.add(new Product("Tablet", 50000.0));

        // consumer kullanarak her bir ürünün adını ve fiyatını yazdıralım.
        Consumer<Product> productConsumer = product -> {
            System.out.println("Name :" + product.getName());
            System.out.println("price :" + product.getPrice());

        };
        productList.forEach(productConsumer);

    }
}
