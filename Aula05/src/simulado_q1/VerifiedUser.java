package simulado_q1;

import java.util.Date;


public class VerifiedUser extends User {
    private Date data;

    public VerifiedUser(String name, Date date) {
        super(name);
        this.data = date;
    }

}
