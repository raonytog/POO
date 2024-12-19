package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User {
    private Date dateTime;

    public VerifiedUser(String twitterId, Date d) {
        super(twitterId);
        this.dateTime = d;
    }
}
