import java.util.Scanner;

import java.util.InputMismatchException;

/**
 * @author  Alex Kapajika
 * @version 1.0
 * @since   2025-02-19
 */
public final class Logging {
    /*
     * @exception IllegalStateException
     * @see IllegalStateException
     */

    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Log length (0.25, 0.5 or 1) : ");
        final float LOG_LENGTH_1 = 0.25f;
        final float LOG_LENGTH_2 = 0.5f;
        final float LOG_LENGTH_3 = 1f;
        final int TRUCK_LIMIT = 1100;
        String strLogLength = scanner.nextLine();

        try{
            float LogLength = Float.parseFloat(strLogLength);
            if ((LogLength == LOG_LENGTH_1) || (LogLength == LOG_LENGTH_2) || (LogLength == LOG_LENGTH_3)){
                float LOGAMOUNT = TRUCK_LIMIT/20 * LogLength;
                System.out.println("The truck will be able to take = " + LOGAMOUNT + " Km");
            } else {
                System.out.println("This length is not part of the options" + LogLength);
                return;
            }
        } catch (NumberFormatException error){
            System.out.println(error.getMessage());
        }
    }
}