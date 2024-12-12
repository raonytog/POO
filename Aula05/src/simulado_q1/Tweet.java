package simulado_q1;

public class Tweet {
    private String txt;

    public Tweet(String txt) {
        this.txt = txt;
    }

    public String getTweet() {
        return this.txt;
    }

    public int getSize() {
        return this.txt.length();
    }
}
