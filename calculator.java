public class ExceptionErrorExample {
    public static void main(String[] args) {
        try {
            // Example of a checked exception (must be handled)
            throw new IOException("Checked Exception");

            // Example of an unchecked exception (can be handled)
            // throw new NullPointerException("Unchecked Exception");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }

        // Example of an error (should not be handled, just for illustration)
        // throw new StackOverflowError("Error");
    }
}
