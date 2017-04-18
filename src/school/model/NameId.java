package school.model;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class NameId {

    private String nameId;
    public NameId(){

    }

    @Override
    public String toString() {
        return "NameId{" +
                "nameId='" + nameId + '\'' +
                '}';
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public NameId(String nameId) {
        this.nameId = nameId;
    }
}
