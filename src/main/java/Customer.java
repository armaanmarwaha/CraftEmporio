import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 * Created by Armaan on 8/6/2015.
 */
public class Customer {
    DBObject Name, Address, DOB, DOR, lastVisit, Orders, Cart, purchasedProducts, sponsoredCustomer;
    String Email,Password,Phone;
    int Sales, bestCustomerRank;
    boolean enabled, newsletter;
    Customer(DBObject Name, String Email, String Password, String Phone, DBObject Address)
    {
        this.Name=Name;
        this.Email=Email;
        this.Password=Password;
        this.Phone=Phone;
        this.Address=Address;
    }
    public final DBObject toDBObject () {
        return new BasicDBObject("Name", this.getName())
                .append("Email", this.getEmail())
                .append("Password", this.getPassword())
                .append("Address", this.getAddress())
                .append("Phone", this.getPhone());
    }
    public void fromDBObject(DBObject o){
        Name=(DBObject)o.get("Name");
        Email=(String)o.get("Email");
        Password=(String)o.get("Password");
        Address=(DBObject)o.get("Address");
        Phone=(String)o.get("Phone");
    }
    public final List<DBObject> find(DBCollection collection, DBObject query) {
        DBCursor cursor = collection.find(query);
        return cursor.toArray();
    }
    public final void addCustomer(DBCollection collection, DBObject customer) {
        collection.insert(customer);
    }
    public DBObject getName() {
        return this.Name;
    }
    public String getEmail() {
        return this.Email;
    }
    public String getPassword() {
        return this.Password;
    }
    public DBObject getAddress() {
        return this.Address;
    }
    public String getPhone() {
        return this.Phone;
    }

}