package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by CJ on 1/24/2018.
 */

public class Family {
    //Step 6 -Singleton created for Family class
    private static Family sFamily;

    private final String TAG = Family.class.getName();

    private ArrayList<FamilyMember> family;

    //Step 7 -> Unsure of what the directions are asking
    private Family() {
        //Step 10 (1) - Instantiating family as a new ArrayList
        family = new ArrayList();
        //Step 10 (2) - test case #1 should result in an error
        family.add(new Guardian());
        //Step 10 (3) - test case #2 should pass
        family.add(new Guardian("Christopher", "Yu"));
    }

    //Step 15 - retrieving data from the sFamily singleton
    public static Family getFamily() {
        if (sFamily == null) {
            Family f = new Family();
            sFamily = f;
        }
        return sFamily;
    }

    //Step 16 -> Unsure if this is correct
    public void setArray(ArrayList<FamilyMember> sFamily) {
        this.family = family;
    }

    public ArrayList<FamilyMember> getArray() {
        return family;
    }

}
