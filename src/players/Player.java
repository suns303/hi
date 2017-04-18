package players;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Player {
    private String yearId;
    private String teamId;
    private String IgId;
    private String playerId;
    private int salary;

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getIgId() {
        return IgId;
    }

    public void setIgId(String igId) {
        IgId = igId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Player(){}

    public Player(String yearId, String teamId, String igId, String playerId, int salary) {
        this.yearId = yearId;
        this.teamId = teamId;
        IgId = igId;
        this.playerId = playerId;
        this.salary = salary;


    }
}
