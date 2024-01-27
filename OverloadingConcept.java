import java.util.Scanner;

/*
 * Overloading methods
Here is a method that takes a long value and returns the max value of the long type minus the given number.

public static long getMaxMinusCurrent(long val) {
    return Long.MAX_VALUE - val;
}
Overload this method with one new method. The method should take an int and return the max value of the int type minus the given value.

For the method, the type of result value must be the same as the type of the parameter.

Sample Input 1:

long
10
Sample Output 1:

9223372036854775797
Sample Input 2:

int
8
Sample Output 2:

2147483639
 */

public class OverloadingConcept {

    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}
