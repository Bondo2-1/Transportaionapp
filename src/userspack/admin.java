package userspack;
import storage.userliststorage;
import storage.userstorage;
import Uber.Uber;


public class admin extends user{
	public admin(String userName, String mobileNumber,String password,String email){
        super(userName, mobileNumber,password,email);
    }
    
    public static void addPendingRegistrations(driver driver){
        Uber.pendingRegistrations.add(driver);
    }
     public static void suspendUser (user user){
         Uber.suspendedUsers.add(user);
    }
       public static void unSuspendUser(user user){
           Uber.registeredUsers.add(user);
           }
     public static void suspendUser (String username){
         for( user user : Uber.registeredUsers ) {
             if(user.getusername().equals(username) ){
                 Uber.registeredUsers.remove(user);
                 Uber.suspendedUsers.add(user);
         }
         }



    }
       public static void unSuspendUser(String username) {
           for (user user : Uber.registeredUsers) {
               if (user.getusername().equals(username)) {
                   Uber.registeredUsers.add(user);
                   Uber.suspendedUsers.remove(user);
               }

           }
       }
    public void listPendingRegistrations(){
        for (driver driver : Uber.pendingRegistrations){
            System.out.println("driver name is :" +driver.getusername());
            System.out.println("driver national id is :" +driver.getNationalID());
            System.out.println("driver driving licence is :" +driver.getDrivingLicense());
            System.out.println("=================================");
        }
    }
    public boolean acceptRegistration(String userName){
        for( user user :Uber.pendingRegistrations ){
            if( user.getusername().equals(userName) ){
                Uber.storeUser(user);
                Uber.pendingRegistrations.remove(user);
                return true;
            }
        }
        System.out.println("User not found");
        return false;
    }
    
    public boolean rejectRegistration(String userName){
        for( user user : Uber.pendingRegistrations ){
            if( user.getusername().equals(userName) ){
                Uber.pendingRegistrations.remove(user);
                System.out.println("registration rejected successfully");
                return true;
            }
        }
        System.out.println("user not found");
        return false;
    }
}
