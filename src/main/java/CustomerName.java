import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Created by Armaan on 8/30/2015.
 */
public class CustomerName {
    String firstName,middleName,lastName,title;
    CustomerName() {
    }
    CustomerName(String title, String firstName, String middleName, String lastName) {
        putTitle(title);
        putFirstName(firstName);
        putMidlleName(middleName);
        putLastName(lastName);
    }
    public void putFirstName(String in){
        firstName=in;
    }
    public void putMidlleName(String in){
        middleName=in;
    }
    public void putLastName(String in){
        lastName=in;
    }
    public void putTitle(String in){
        title=in;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getTitle()
    {
        return title;
    }
    public final DBObject toDBObject () {
        return new BasicDBObject("Title", this.getTitle())
                .append("First_Name", this.getFirstName())
                .append("Middle_Name", this.getMiddleName())
                .append("Last_Name", this.getLastName());
    }
    public void fromDBObject(DBObject o){
        title=(String)o.get("Title");
        firstName=(String)o.get("First_Name");
        middleName=(String)o.get("Middle_Name");
        lastName=(String)o.get("Last_Name");
    }
}
