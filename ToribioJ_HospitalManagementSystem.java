
   package toribioej_IT20A;
   
   import java.util.*;



class Patient {

    String patientname;
    int severity;

    public Patient(String patientname, int severity) {
        this.patientname = patientname;
        this.severity = severity;
    }

    public String toString() {
        return patientname + "(Severity: " + severity + ")";
    }
}

public class ToribioJ_HospitalManagementSystem {

    public static void main(String[] args) {
        Queue<Patient> arrivalOrder = new LinkedList<>();
        PriorityQueue<Patient> treatmentOrder = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));

        arrivalOrder.offer(new Patient("Anna", 3));
        arrivalOrder.offer(new Patient("Bob", 1));
        arrivalOrder.offer(new Patient("Carla", 2));
        arrivalOrder.offer(new Patient("Dave", 1));

        treatmentOrder.addAll(arrivalOrder);

        System.out.println("=== Arrival Order ===");
        System.out.print("Arrival Order");
        System.out.println(arrivalOrder);
        System.out.println("=== Treatment Order ===");
        while (!treatmentOrder.isEmpty()) {
            Patient next = treatmentOrder.poll();
            System.out.println("Treating: " + next);
        }
    }

    }
    
