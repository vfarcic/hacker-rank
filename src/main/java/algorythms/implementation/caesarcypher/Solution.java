package algorythms.implementation.caesarcypher;

import java.util.Scanner;

public class Solution {

    protected static String getOutput(char[] text, int rotate) {
        for (int index = 0; index < text.length; index++) {
            char character = text[index];
            character = rotateChar(character, rotate, 'a', 'z');
            character = rotateChar(character, rotate, 'A', 'Z');
            text[index] = character;
        }
        return new String(text);
    }

    private static char rotateChar(char character, int rotate, char startChar, char endChar) {
        int realRotate = rotate % (endChar - startChar + 1);
        if (character >= startChar && character <= endChar) {
            character = (char) (character + realRotate);
            if (character > endChar) {
                character = (char) (startChar + character % endChar - 1);
            }
        }
        return character;
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        char[] text = in.next().toCharArray();
        int rotate = in.nextInt();
        System.out.println(Solution.getOutput(text, rotate));
    }

}