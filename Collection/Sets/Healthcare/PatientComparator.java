package Collection.Sets.Healthcare;

import java.util.Comparator;

/**
 * PatientComparator
 */
public class PatientComparator implements Comparator<Patient> {

    public int compare(Patient p1, Patient p2) {
        return p1.getAge() - p2.getAge();
    }

    
}