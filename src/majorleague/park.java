package majorleague;

import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility;

import java.util.ArrayList;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class park {
    private String parkKey;
    private String parkName;
    private String parkAlias;
    private String city;
    private String state;
    private String country;

    public park(){

    }

    public park(String parkKey,String parkName,String parkAlias,
                String city, String state, String country){
        this.parkKey = parkKey;
        this.parkName = parkName;
        this.parkAlias = parkAlias;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getParkKey() {
        return parkKey;
    }

    public void setParkKey(String parkKey) {
        this.parkKey = parkKey;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkAlias() {
        return parkAlias;
    }

    public void setParkAlias(String parkAlias) {
        this.parkAlias = parkAlias;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
