import java.util.ArrayList;
import java.util.List;

public class Product
{
    private String productId;
    private double price;
    private Retailer retailer;
    private int stock;
    private List<Review> reviews = new ArrayList<>();

    public double getRatingFromReviews()
    {
        return 0;
    }
}
