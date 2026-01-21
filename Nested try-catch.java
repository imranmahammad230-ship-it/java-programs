public class MarksValidation {

   static void validateMarks(int marks) throws Exception {

        if (marks < 0 || marks > 100) {

            throw new Exception("Invalid Marks: Must be between 0 and 100");
        }

        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {

        try {
            validateMarks(120);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
