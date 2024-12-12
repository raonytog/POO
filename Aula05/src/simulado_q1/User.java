package simulado_q1;

import java.util.LinkedList;

public class User {
    private String twitterId;
    private LinkedList<Tweet> tweets;
    
    public User(String name) {
        this.twitterId = name;
        this.tweets = new LinkedList<>();
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public LinkedList<Tweet> getTweets() {
        return this.tweets;
    }

    public void addTweet(Tweet t) {
        this.tweets.addFirst(t);
    }

    public int getTweetQtd() {
        return this.tweets.size();
    }

    public int getTweetSizeSum() {
        int total = 0;
        for (Tweet t: this.tweets) {
            total += t.getSize();
        }
        return  total;
    }
}
