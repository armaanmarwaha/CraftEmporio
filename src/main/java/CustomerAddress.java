import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Created by Armaan on 8/31/2015.
 */
public class CustomerAddress {
    String num,street,locality,town,state,country,pin;
    CustomerAddress() {
    }
    CustomerAddress(String num, String street, String locality, String town, String state, String country, String pin) {
        putNum(num);
        putStreet(street);
        putLocality(locality);
        putTown(town);
        putState(state);
        putCountry(country);
        putPIN(pin);
    }
    public void putNum(String in){
        num=in;
    }
    public void putStreet(String in){
        street=in;
    }
    public void putLocality(String in){
        locality=in;
    }
    public void putTown(String in){
        town=in;
    }
    public void putState(String in){
        state=in;
    }
    public void putCountry(String in){
        country=in;
    }
    public void putPIN(String in){
        pin=in;
    }
    public String getNum(){
        return num;
    }
    public String getStreet(){
        return street;
    }
    public String getLocality(){
        return locality;
    }
    public String getTown()
    {
        return town;
    }
    public String getState()
    {
        return state;
    }
    public String getCountry()
    {
        return country;
    }
    public String getPIN()
    {
        return pin;
    }

    public final DBObject toDBObject () {
        return new BasicDBObject("Num", this.getNum())
                .append("Street", this.getStreet())
                .append("Locality", this.getLocality())
                .append("Town", this.getTown())
                .append("State", this.getState())
                .append("Country", this.getCountry())
                .append("PIN", this.getPIN());
    }
    public void fromDBObject(DBObject o){
        num=(String)o.get("Num");
        street=(String)o.get("Street");
        locality=(String)o.get("Locality");
        town=(String)o.get("Town");
        state=(String)o.get("State");
        country=(String)o.get("Country");
        pin=(String)o.get("PIN");
    }
}
