package examples.pltw.org.collegeapp;

/**
 * Created by ckinnard on 4/3/2017.
 */
public abstract class FamilyMember extends ApplicantData {
    private String firstName;
    private String lastName;

    public FamilyMember() {
        firstName = "Ada";
        lastName = "Lovelace";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Step 9 - Constructor w/ firstName and lastName as parameters
    public FamilyMember(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
