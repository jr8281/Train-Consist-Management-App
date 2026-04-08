import java.util.LinkedList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * Models ordered chaining of train bogies using LinkedList.
 * Supports insertion at specific positions and removal from ends.
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=========================================\n");

        // Create a LinkedList to maintain order
        List<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        if (!trainConsist.isEmpty()) {
            ((LinkedList<String>) trainConsist).removeFirst();
            ((LinkedList<String>) trainConsist).removeLast();
        }

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}
