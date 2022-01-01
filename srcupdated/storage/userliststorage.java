package storage;

import userspack.user;
import userspack.client;
import userspack.driver;
import java.util.ArrayList;
import java.util.List;


public class userliststorage extends userstorage{

    public static List<driver> pendingRegistrations=new ArrayList<>();
    public static ArrayList<user> registeredUsers=new ArrayList<>() ;
    public static ArrayList<driver> registeredDrivers =new ArrayList<>();
    public static ArrayList<client> registeredClients=new ArrayList<>();

    @Override
    public boolean addRegisteredUser(user user) {
        registeredUsers.add( user );
        if(user instanceof driver) registeredDrivers.add( (driver) user );
        if(user instanceof client) registeredClients.add( (client) user );
        return false;
    }

    @Override
    public boolean removeRegisteredUser(user user) {
        return false;
    }

    @Override
    public boolean addPendingRegistration(driver driver) {
        pendingRegistrations.add(driver);
        return true;
    }

    @Override
    public boolean removePendingRegistration(driver driver) {
        pendingRegistrations.remove(driver);
        return true;
    }

    @Override
    public List<driver> getPendingRegistrations() {
        return pendingRegistrations;
    }
}
