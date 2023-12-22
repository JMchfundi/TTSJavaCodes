package co.ke.tucode.payloads;

public class TTSPyramidPayload

{
    // 1. Using StringBuffer
    public static void printpattern1Pyramid(Integer integerRows) {
        int rowCount = 1;
        for (int i = integerRows; i > 0; i--) {
            // Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Printing 'rowCount' value 'rowCount' times at the end of each row

            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();

            // Incrementing the rowCount

            rowCount++;
        }
    }

    // 2. Using iterative method
    public static String reverseWithIterativeMethod(String string) {
        char[] stringArray = string.toCharArray();
        char[] reversedString = new char[stringArray.length];

        int reversedStringIndex = 0;
        for (int i = stringArray.length - 1; i >= 0; i--) {
            reversedString[reversedStringIndex] = stringArray[i];
            reversedStringIndex++;
        }

        return String.valueOf(reversedString);
    }

    // 3. Recursive method to reverse string

    public static String reverseWithRecursiveMethod(String string) {
        if ((null == string) || (string.length() <= 1)) {
            return string;
        }

        return reverseWithRecursiveMethod(string.substring(1)) + string.charAt(0);
    }
}