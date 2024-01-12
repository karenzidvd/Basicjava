package com.Answers;

public class StringReverser {

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
    public static void main(String[] args) {
      
        String input1 = "Hello, World!";
        String reversed1 = reverseString(input1);
        System.out.println("Original: " + input1);
        System.out.println("Reversed: " + reversed1);

        String input2 = "Java Programming";
        String reversed2 = reverseString(input2);
        System.out.println("Original: " + input2);
        System.out.println("Reversed: " + reversed2);

    }
}
