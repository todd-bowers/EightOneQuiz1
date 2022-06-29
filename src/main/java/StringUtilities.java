import java.util.Arrays;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String c = baseValue +
                valueToBeAdded;
        return c;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder r = new StringBuilder();
        for (int i = valueToBeReversed.length()-1; i >= 0; i--) {
            r.append(valueToBeReversed.charAt(i));
        }
        return String.valueOf(r);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char middle = word.charAt((word.length()-1)/2);
        return middle;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        value = value.replace(String.valueOf(charToRemove), "");
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] words = sentence.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord;
    }
}
