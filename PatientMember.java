package div1;
import java.util.*;

class PatientMember {
    String name;
    double height; // in meters
    double weight; // in kg

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
    	PatientMember p = new PatientMember();
        p.name = "Raju";
        p.height = 160.5;
        p.weight = 65;

        System.out.println("BMI = " + p.computeBMI());
    }
}