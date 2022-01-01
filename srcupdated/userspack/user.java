package userspack;

public class user {
    String userName,mobileNumber,password,email;
    public static int count=0;
    public user(String userName, String mobileNumber,String password,String email){
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.email = email;
        count++;
    }
    
    public user(String userName, String mobileNumber,String password){
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.email = null;
    }

    public String getusername(){
        return this.userName;
    }
    public String getPassword(){
        return this.password;
    }

   
}
