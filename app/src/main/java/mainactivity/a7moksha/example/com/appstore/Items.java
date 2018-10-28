package mainactivity.a7moksha.example.com.appstore;

/**
 * Created by 7moksha on 10/27/2018.
 */

public class Items {
    private String name;
    private String price;
    private int image_id;
    public  Items(String name, String price, int image_id) {
        this.name = name;
        this.price = price;
        this.image_id = image_id;}
    public String getName(){return name;}
    public String getPrice(){return price;}
    public int getImage_id(){return image_id;}
}
