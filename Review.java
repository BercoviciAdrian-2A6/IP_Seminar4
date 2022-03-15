import java.util.ArrayList;
import java.util.List;

public class Review
{
    private Product product;
    private User reviewer;
    private int rating;
    private String title, content;
    private List<User> foundHelpful = new ArrayList<>();
}
