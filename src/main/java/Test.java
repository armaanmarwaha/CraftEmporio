import com.mongodb.*;

import java.util.List;

/**
 * Created by Armaan on 8/30/2015.
 */
public class Test {
    public static void main(String args[]){
        try {
            ProductPrice pp=new ProductPrice("10\'","1000","1000");
            BasicDBList pbs=new BasicDBList();
            pbs.add(pp.toDBObject());
            Product a=new Product("Shiva","Osho","Wooden",pbs,"wooden wall hanging ganesh","asd.com/sdf/dfg.png");
            DBObject p = a.toDBObject();
            MongoClient mc = new MongoClient("localhost", 27017);
            DB db = mc.getDB("mydb");
            DBCollection collection = db.getCollection("Products");
            a.addProduct(collection,a.toDBObject());
            DBObject query = new BasicDBObject("Name", "Shiva");
            List<DBObject> l1 = null;
            l1 = a.find(collection, query);
            DBObject d=new BasicDBObject();
            d=(DBObject)l1.get(0);
            System.out.println(l1.toString() + "\narmaan\n" + d.get("PriceBySize")+"\n"+d.get("_id").toString());
            a.addSize(collection, d.get("_id"), "12\'", "1200", "1200");
            l1 = a.find(collection, query);
            d=(DBObject)l1.get(0);
            System.out.println(l1.toString() + "\narmaan\n" + d.get("PriceBySize")+"\n"+d.get("_id").toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
