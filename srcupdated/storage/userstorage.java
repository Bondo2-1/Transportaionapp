package storage;

import java.util.List;

import userspack.user;
import userspack.client;
import userspack.driver;


public abstract class userstorage {
    public abstract boolean addRegisteredUser( user user );
    public abstract boolean removeRegisteredUser( user user );
    public abstract boolean addPendingRegistration( driver driver );
    public abstract boolean removePendingRegistration( driver driver );

 

   public abstract List<driver> getPendingRegistrations();
}
