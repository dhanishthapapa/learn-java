package execption_handling;
/*The throws keyword is used to declare that
 a method may throw one or more exceptions.
 It tells the caller of the method that they 
 must handle the exception or pass it further. */
public class thros {
     static void divide() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void main(String[] args) {
        divide();
    }
}
