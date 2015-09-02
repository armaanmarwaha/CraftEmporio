import com.mongodb.*;

import java.util.List;

/**
 * Created by Armaan on 8/6/2015.
 */
public class Product {
    String Name, Manufacturer, Type, Details, ImgURL, Reference, Category;
    int qty;
    boolean status;
    BasicDBList PriceBySize;
    Product(String Name, String Manufacturer, String Type, BasicDBList PriceBySize, String Details, String ImgURL)
    {
        this.Name=Name;
        this.Manufacturer=Manufacturer;
        this.Type=Type;
        this.PriceBySize=PriceBySize;
        this.Details=Details;
        this.ImgURL=ImgURL;
    }
    public final void addSize(DBCollection collection, Object pid, String size, String basePrice, String finalPrice){
        DBObject query = new BasicDBObject("_id",pid);
        DBObject pr  = new BasicDBObject("Size",size)
                .append("Base_Price", basePrice)
                .append("Final_Price", finalPrice);
        List<DBObject> l1 = find(collection, query);
        DBObject x=new BasicDBObject("PriceBySize",pr);
        collection.update(query, new BasicDBObject().append("$addToSet", x));
    }
    public final DBObject toDBObject () {
        return new BasicDBObject("Name", this.getName())
                .append("Manufacturer", this.getManufacturer())
                .append("Type", this.getType())
                .append("Details", this.getDetails())
                .append("ImgURL", this.getImgURL())
                .append("PriceBySize", this.getPriceBySize());
    }
    public final List<DBObject> findByID(DBCollection collection, DBObject query) {
        DBObject x = new BasicDBObject("_id","1");
        DBCursor cursor = collection.find(query,x);
        return cursor.toArray();
    }
    public final List<DBObject> find(DBCollection collection, DBObject query) {
        DBCursor cursor = collection.find(query);
        return cursor.toArray();
    }
    public final void addProduct(DBCollection collection, DBObject product){
        collection.insert(product);
    }
    public String getName() {
        return this.Name;
    }
    public String getManufacturer() {
        return this.Manufacturer;
    }
    public String getType() {
        return this.Type;
    }
    public DBObject getPriceBySize() {
        return this.PriceBySize;
    }
    public String getDetails() {
        return this.Details;
    }
    public String getImgURL() {
        return this.ImgURL;
    }

}