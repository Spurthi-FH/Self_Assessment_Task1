
public class SoliloquySorter {

    public static void main(String[] args) {
        // Step 1: Set up the soliloquy
        String text = "To be, or not to be, that is the question:\n" +
                      "Whether 'tis nobler in the mind to suffer\n" +
                      "The slings and arrows of outrageous fortune,\n" +
                      "Or to take arms against a sea of troubles\n" +
                      "And by opposing end them.";

        // Step 2: Extract words (remove punctuation, split by spaces)
        text = text.replaceAll("[^a-zA-Z ]", ""); // remove punctuation
        String[] words = text.toLowerCase().split("\\s+"); // split by whitespace

        // Step 3: Bubble sort the words alphabetically
        boolean swapped;
        int n = words.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    // Swap words[i] and words[i+1]
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    swapped = true;
                }
            }
            n--; // optimization: last element is already sorted
        } while (swapped);

        // Step 4: Print the sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
