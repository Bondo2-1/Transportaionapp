package userspack;


import java.util.ArrayList;
import java.util.List;
import offer.offer;
import offer.ride;


public class driver extends user {
	private int id;
    private String drivingLicense, nationalID;
    public List<String> favAreas;
    public List<ride> ridesInFavAreas=null;
    public ArrayList <rating> list = new ArrayList<rating>();
    
    public driver(String userName, String mobileNumber,String password,String email,String drivingLicense, String nationalID){
        super(userName, mobileNumber,password,email);
        this.drivingLicense=drivingLicense;
        this.nationalID=nationalID;
        this.id=count;
    }
    public boolean listRides(String sourceArea){
        boolean found=false;
        for (ride ride:ridesInFavAreas){
            if(ride.getSource().equals(sourceArea)){
                ride.getRideInfo();
                found=true;
            }
        }
        return found;
    }
    public void suggestPrice(double price,int rideId){
        for(ride ride: ridesInFavAreas){
            if(ride.getId()==rideId){
                offer offer = new offer(ride,price,this);
            }
        }
    }
    
    public void showRatingList() {
        for (rating rating : list){
            System.out.println("rating is :" +rating.rating);
            System.out.println("Client name is :" +rating.client.getusername());
            System.out.println("=================================");
        }

    }
    public double calculateAverageRating() {
        int sum = 0;
        for (rating rating : list) {
            sum = sum + rating.rating;
        }
        return ((double) sum /list.size() );
    }
    public void getDriverInfo(){
        System.out.println("Driver Name is"+userName);
        System.out.println("Driver id is"+id);
        System.out.println("Driver total rating is"+calculateAverageRating());
        System.out.println("=================================");
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }
    public String getNationalID() {
        return nationalID;
    }
}
