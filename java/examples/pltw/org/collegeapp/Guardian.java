package examples.pltw.org.collegeapp;

/**
 * Created by ckinnard on 4/3/2017.
 */
public class Guardian extends FamilyMember {
    private String occupation;


    //Step 11 - default constuctor
    public Guardian() {
        super();
    }

    //Step ??
    public Guardian(String firstName, String lastName) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }




    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {

        this.occupation = occupation;
    }
}
