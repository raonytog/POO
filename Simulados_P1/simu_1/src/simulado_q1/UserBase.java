package simulado_q1;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserBase {
    private Set<User> users;
    private int verified;

    public UserBase() {
        this.users = new HashSet<>();
        this.verified = 0;
    }

    public User createUser(String name) {
        User usuario = new User(name);
        this.users.add(usuario);
        return usuario;
    }

    public int tamanhoMedioTweets() {
        int sum = 0, qtd = 0;
        for (User u : this.users) {
            qtd += u.getTweetQtd();
            sum += u.getTweetSizeSum();
        }

        return  sum/qtd;
    }

    public VerifiedUser createVerifiedUser(String name, Date data) {
        VerifiedUser u = new VerifiedUser(name, data);
        this.users.add(u);
        this.verified++;

        return u;
    }

    public float porcentagemVerificados() {
        return (float) this.verified / this.users.size();
    }
}
