package simulado_q1;

import java.util.LinkedList;

public class User {
    private String twitterId;
    private LinkedList<Tweet> tweets = new LinkedList<>();

    public User(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void addTweet(Tweet t) {
        this.tweets.addFirst(t);
    }

    public double getQtdTweets() {
        return (double) tweets.size();
    }

    public double getQtdCharacteres() {
        double total = 0;
        for (Tweet t : this.tweets) {
            total += t.getTxt().length();
        }

        return total;
    }




}
