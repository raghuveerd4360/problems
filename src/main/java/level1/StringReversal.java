package level1;

/*
Reverse String - keeping performance in mind (without StringBuffer)
program in java- important interview program
 */
public class StringReversal {
    public String reverse(String input) {
        char[] chars = input.toCharArray();
        int loopSize = input.length() / 2;
        for (int i = 0; i < loopSize; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}