package offer;
import userspack.driver;
import Uber.Uber;
import java.util.List;

import userspack.client;
import userspack.driver;


public class ride {
	private static int count=0;
    private client client;
    private int id;
    private String source;
    private String destination;
    public List<offer> offers;
    public ride(client client,String source,String destination) {
        this.client =client;
        this.source=source;
        this.destination=destination;
        count++;
        this.id=count;
 }
    public int getId() {
        return id;
    }
    public String getSource() {
        return source;
    }
    public void getRideInfo(){
        System.out.println("Ride id is"+id);
        System.out.println("Ride source area's name is"+source);
        System.out.println("Ride destination area's name is"+destination);
        System.out.println("Client's name is"+client.getusername());
        System.out.println("==============================");
    }
    public void addOffer(offer offer){
        offers.add(offer);
        System.out.println("Offer added successfully");
    }
    public boolean notifyDrivers(String source){
        boolean found=false;
        for (driver driver : Uber.drivers){
            for (String area : driver.favAreas){
                if (area.equals(source)){
                    driver.ridesInFavAreas.add(this);
                    found=true;
                }
            }
        }
        return found;
    }

}
