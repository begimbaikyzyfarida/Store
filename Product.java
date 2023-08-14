package product;
import java.time.LocalDate;
import java.util.Random;

public class Product {
    private String productName;
    private int expDay;
    private boolean isFresh;
    private LocalDate producedOn;
    private String placeOfProducts;
    private static Random random = new Random();

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
        generateDate();
        setPlace();
        isFresh();
    }
