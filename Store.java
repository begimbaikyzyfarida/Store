package product;
import java.util.Random;
public class Store {
    Product[] products;
    private static Random random = new Random();

    public void doInspection() {
        int i = 1;
        System.out.println(
                "=======================  Inspection result  =======================\n" +
                        "Product      | Produced On   | Storage place   |  life days   | Fresh\n" +
                        "-----------+---------------+---------------+--------------+------------+\n");
        for (Product p : this.products) {
            System.out.printf("%-2d|%-3s | %-3s | %-15s | %-3d | %s\n",
                    i, p.getProductName(),
                    p.getProducedOn(),
                    p.getPlaceOfProducts(),
                    p.getExpDay(),
                    p.getIsFresh());
            i++;
        }
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public static void randomProduct(Product[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Product temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
