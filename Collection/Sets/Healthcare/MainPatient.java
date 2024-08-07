package Collection.Sets.Healthcare;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainPatient {

    public static int getPatientAge(String name, Set<Patient> patients) {
        for (Patient patient : patients) {
            if(patient.getName().equals(name)) {
                return patient.getAge();
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        // With Comparable
        TreeSet<Patient> set = new TreeSet<>();
        List<Patient> list = new ArrayList<>();
        list.add(new Patient(6, "Shriprada", 46));
        list.add(new Patient(8, "Nandan", 12));
        list.add(new Patient(2, "Sukruti", 70));
        list.add(new Patient(9, "Vishnu", 2));
        list.add(new Patient(10, "Kate hobbs", 16));
        set.addAll(list);
        System.out.println("List - " + list + "\nSet (sorting by age comparable) - " + set);
        

        // With Comparator
        Set<Patient> patientSet = new TreeSet<>(new PatientComparator());
        patientSet.addAll(list);
        System.out.println("List - " + list + "\nSet (sorting by age comparator) - " + set);

        System.out.println("Demo for getting age: ");
        System.out.println("Age of Nandan" + getPatientAge("Nandan: ", patientSet));

    }
}
