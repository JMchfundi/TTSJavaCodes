package co.ke.tucode.payloads;

public class ReverseTheString

{
    // 1. Using StringBuffer
    public static String reverseWithStringBuffer(String string) {
        return String.valueOf(new StringBuffer(string).reverse());
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