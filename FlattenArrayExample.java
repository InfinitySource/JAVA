import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    int[] prices;

    public Product(int id, String name, int[] prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }
}

public class FlattenArrayExample {
    public static void main(String[] args) {
        Product[] costProduct = {
            new Product(1, "Product A", new int[]{10, 20, 30}),
            new Product(2, "Product B", new int[]{15, 25}),
            new Product(3, "Product C", new int[]{5, 10, 15, 20})
        };

        List<Object> flattenedResult = flattenArray(costProduct);
        System.out.println(flattenedResult);
    }

    public static List<Object> flattenArray(Product[] products) {
        List<Object> flattened = new ArrayList<>();

        for (Product product : products) {
            // Add the id and name of the product
            flattened.add(product.id);
            flattened.add(product.name);

            // Add the prices
            for (int price : product.prices) {
                flattened.add(price);
            }
        }

        return flattened;
    }
}
