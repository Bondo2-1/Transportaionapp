package userspack;

public class rating {
    public client client;
    public int rating;


    public rating(client c ,int r)
    {
        client = c;
        rating = r;
    }

    public String tostring()
    {
        return "rate " + rating +"/n";

    }

}
