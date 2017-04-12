package hall;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallofFame {

    private String playerID;
    private int ballots;
    private int needed;
    private int votes;

    public HallofFame(){};

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getBallots() {
        return ballots;
    }

    public void setBallots(int ballots) {
        this.ballots = ballots;
    }

    public int getNeeded() {
        return needed;
    }

    public void setNeeded(int needed) {
        this.needed = needed;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public HallofFame(String playerID, int ballots, int needed, int votes) {
        this.playerID = playerID;
        this.ballots = ballots;
        this.needed = needed;
        this.votes = votes;


    }
}
