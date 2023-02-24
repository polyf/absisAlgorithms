public class Palindrome {

    /**
     * @author polyf
     * @param word is the parsed String
     * @throws IllegalArgumentException if the word is null
     */

    public static boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("The word have no characters");
        }
        int leftIndex = 0;
        int rightIndex = word.length() - 1;
        while (leftIndex < rightIndex) {
            if (word.charAt(leftIndex) != word.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("arara"));
        System.out.println(isPalindrome("cachorro"));
    }
}

