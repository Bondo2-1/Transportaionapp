package offer;
import userspack.driver;
import userspack.client;

public class offer {
	 private ride ride;
	    private static int count=0;
	    private  int id=0;
	    private double price;
	    private driver driver;
	    public void addOffer(){
	        this.ride.addOffer(this);
	    }
	    public offer(ride ride, double price, driver driver) {
	        this.ride = ride;
	        this.price = price;
	        this.driver = driver;
	        this.id=count;
	        addOffer();
	    }
	    public void getOfferInfo(){
	        System.out.println("Offer id is"+id);
	        driver.getDriverInfo();
	        System.out.println("Suggested price is"+price);
	        System.out.println("///////////////////////////");
	    }
}
