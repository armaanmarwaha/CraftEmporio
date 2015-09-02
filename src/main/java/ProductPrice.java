import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Created by Armaan on 9/1/2015.
 */
public class ProductPrice {
    String size, basePrice, finalPrice;

    ProductPrice() {

    }

    ProductPrice(String size, String basePrice, String finalPrice) {
        putSize(size);
        putBasePrice(basePrice);
        putFinalPrice(finalPrice);
    }

    public void putSize(String in) {
        size = in;
    }

    public void putBasePrice(String in) {
        basePrice = in;
    }

    public void putFinalPrice(String in) {
        finalPrice = in;
    }

    public String getSize() {
        return size;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public DBObject toDBObject() {
        return new BasicDBObject("Size", size)
                .append("Base_Price", basePrice)
                .append("Final_Price", finalPrice);
    }

    public void fromDBObject(DBObject o) {
        size = (String) o.get("Size");
        basePrice = (String) o.get("Base_Price");
        finalPrice = (String) o.get("Final_Price");
    }
}