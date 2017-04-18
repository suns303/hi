package salarys;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Salary {

    private String yearlD;
    private String teamID;
    private String lgID;
    private String playerID;
    private String salary;

    public String getYearlD() {
        return yearlD;
    }

    public void setYearlD(String yearlD) {
        this.yearlD = yearlD;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Salary(String yearlD, String teamID, String lgID, String playerID, String salary) {
        this.yearlD = yearlD;
        this.teamID = teamID;
        this.lgID = lgID;
        this.playerID = playerID;
        this.salary = salary;




    }
}