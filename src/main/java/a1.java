import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Armaan on 8/6/2015.
 */

public class a1 {
    public static void main(String args[])
    {
        System.out.println("PAPA ROCKS");
        try
        {
            /*MongoClient mc = new MongoClient("localhost",27017);
            DB db = mc.getDB("CE");
            //DBCollection collection = db.getCollection("Customers");
            DBCollection Pcollection = db.getCollection("Products");
            CustomerName n=new CustomerName();

            Customer c = new Customer("Armaan","armaan.kmarwaha.cse12@iitbhu.ac.in","pass1303","9670976720","A-204, JSG, Indirapuram, Ghaziabad");
            DBObject pbs=new BasicDBObject("Price","1000")
                    .append("Size","10");
            Product p = new Product("Ganesh","armaanmarwaha","Stone",pbs,"ABCDEFGHIJK","abcd.com");
            //DBObject customer = c.toDBObject();
            //c.addCustomer(collection, customer);
            DBObject product = p.toDBObject();
            p.addProduct(Pcollection,product);
            DBObject dbo = new BasicDBObject("ObjectId", "55c888e566ec0528ece8764e");
            List<DBObject> db1 = null;
            DBObject query=new BasicDBObject("_id","ObjectId(\"55c888e566ec0528ece8764e\")");
            System.out.println("Armaan "+p.find(Pcollection, query).toString());
            query=new BasicDBObject("CustomerName","Ganesh");
            System.out.println(p.find(Pcollection, query).toString());
            db1=p.findByID(Pcollection, query);
            String s = new String();
            DBObject dbq = (BasicDBObject)db1.get(0);
            s=dbq.get("_id").toString();
            System.out.println(s);
            p.addSize(Pcollection, s, 5, 5);
            query=new BasicDBObject("_id","55c888e566ec0528ece8764e");
            System.out.println(p.find(Pcollection, query).toString());*/
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
