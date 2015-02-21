import java.io.Serializable;

/**
 * Created by condor on 10/02/15.
 * FastTrackIT, 2015
 */
class Item implements Serializable{
    private String name;
    private String prenume;
    private String phoneNumber;

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
