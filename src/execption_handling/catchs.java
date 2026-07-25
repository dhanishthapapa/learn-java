package execption_handling ;
/*The try block contains code that may generate an exception.
try {
    // risky code
}*
The catch block handles the exception.
*/
public class catchs {
    public void riskyMethod() {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        catchs obj = new catchs();
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        obj.riskyMethod();
    }
}
