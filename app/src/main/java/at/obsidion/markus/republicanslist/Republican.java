package at.obsidion.markus.republicanslist;

import java.io.Serializable;

/**
 * Created by Leo Ignis on 25.11.2016.
 */

public class Republican implements Serializable {

    private String party = "Republicans";
    private String name;
    private String address;
    private String phoneNumber;
    private String age;
    private String votes;

    //---------------------------------------------------------------------------------------
    //                      Generator
    //---------------------------------------------------------------------------------------

    public Republican(String name, String address, String phoneNumber, String age, String votes) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.votes = votes;
    }


    //---------------------------------------------------------------------------------------
    //                      GETTER && SETTER
    //---------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }


    //---------------------------------------------------------------------------------------
    //                         EQUALS
    //---------------------------------------------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Republican that = (Republican) o;

        if (party != null ? !party.equals(that.party) : that.party != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null)
            return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        return votes != null ? votes.equals(that.votes) : that.votes == null;

    }

    @Override
    public int hashCode() {
        int result = party != null ? party.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (votes != null ? votes.hashCode() : 0);
        return result;
    }


    //---------------------------------------------------------------------------------------
    //                         ToString
    //---------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "The candidate from the " + party + " is the " +
                age + " years old " +
                name + "! \n";
    }

    //---------------------------------------------------------------------------------------
    //                         OWN METHODS
    //---------------------------------------------------------------------------------------

    public void beRacist(String target) {
        System.out.println("All " + target +" are criminals!!!");
    }

}