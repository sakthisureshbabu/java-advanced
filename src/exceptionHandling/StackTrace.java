package exceptionHandling;


// printStackTrace() - widely used for debugging. Prints detailed information about an exception, helping developers to undestand where and why an error occured.
public class StackTrace {
    static void testException1() throws Exception {
        ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();
        Exception ex = new Exception();
        ex.initCause(ae);
        throw ex;
    }

    public static void main(String[] args) {
        try {
            int[] arr = new int[2];

            // This will throw ArrayIndexOutofBound
            arr[5] = 10;
        } catch(Throwable e) {
            // Prints exception details
            e.printStackTrace();
        }

        try {
            testException1();
        } catch(Throwable e) {
            e.printStackTrace();
        }
    }
}
