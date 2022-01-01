package userspack;
import Uber.Uber;
import offer.offer;
import offer.ride;

import storage.userliststorage;
import storage.userstorage;
import Uber.Uber;

public class client extends user {
    private int id=0;
    ride rideRequest=null;

    public client(String userName, String mobileNumber,String password,String email){
        super(userName, mobileNumber,password,email);
        this.id=count;
    }
    // Email attribute is optional
    public client(String userName, String mobileNumber,String password){
        super(userName, mobileNumber,password);
        this.id=count;

    }

    public void requestRide(String source,String destination){
        ride rideRequest = new ride(this,source,destination);
        boolean status;
        status=rideRequest.notifyDrivers(source);
        if (status){
            Uber.rides.add(rideRequest);
            this.rideRequest=rideRequest;
            System.out.println("requested successfully");
        }
        else {
            System.out.println("no drivers in Your area");
        }
    }
    public void viewOffers(){
        if(this.rideRequest==null)
        {
            System.out.println("no Rides yet.");
        }
        else if(rideRequest.offers==null||rideRequest.offers.size()==0)
        {
            System.out.println("no offers yet.");
        }

        else {
            for (offer offer:rideRequest.offers){
                offer.getOfferInfo();
            }
        }

    }
    public void addRating(driver dr , int r) {
        rating rate = new rating(this,r);
        dr.list.add(rate);
    }

}
