package hall;

import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerAverage {

    private String playerId;
    private int average;

    public PlayerAverage(){}

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "PlayerAverage{" +
                "playerId='" + playerId + '\'' +
                ", average=" + average +
                '}';
    }

    public PlayerAverage(String playerId, int average) {
        this.playerId = playerId;
        this.average = average;



    }
}
