package leetcode.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        int firstExampleOutput = lengthOfLastWord("Hello World");
        System.out.println("First Example Last Word Length is: " + firstExampleOutput);

        int secondExampleOutput = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("Second Example Last Word Length is: " + secondExampleOutput);

        int thirdExampleOutput = lengthOfLastWord("luffy is still joyboy");
        System.out.println("Third Example Last Word Length is: " + thirdExampleOutput);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        for(;index>=0; index--) {
            if(s.charAt(index) != ' ')
                break;
        }
        int lengthOfLastWord = 0;
        for(;index>=0; index--) {
            if(s.charAt(index) != ' ')
                lengthOfLastWord++;
            else break;
        }

        return lengthOfLastWord;
    }
}