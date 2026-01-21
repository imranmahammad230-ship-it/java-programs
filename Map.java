package div1;
import java.util.Map;
import java.util.LinkedHashMap;

public class Collect_6 {
    public static void main(String[] args) {

        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Imran");
        students.put(102, "Divya");
        students.put(103, "Anil");

        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

