package simulado_q1;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserBase {
    private Set<User> users = new HashSet<>();

    public User createUser(String id) {
        User u = new User(id);
        this.users.add(u);
        return u;
    }

    public VerifiedUser createVerifiedUser(String id, Date d) {
        VerifiedUser v = new VerifiedUser(id, d);
        this.users.add(v);
        return v;
    }

    public double porcentagemVerificados() {
        double qtdVerificados = 0;
        for (User u : this.users) {
            if (u instanceof VerifiedUser) qtdVerificados++;
        }

        return qtdVerificados / this.users.size();
    }

    public double tamanhoMedioTweets() {
        double qtdTweet = 0;
        double tamTweets = 0;
        for (User u : this.users) {
            qtdTweet += u.getQtdTweets();
            tamTweets += u.getQtdCharacteres();
        }

        return tamTweets / qtdTweet; 
    }

}
