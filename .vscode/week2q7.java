public class week2q7 {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word);
            result.append(reverse.reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}