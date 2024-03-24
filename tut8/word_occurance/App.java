package tut8.word_occurance;

public class App {
    public static void main(String[] args) {
        WordOccurrence wp = new WordOccurrence();
        wp.countWord("testdata");
        System.out.println(wp.getTotalWords());
         wp.writeWordCounts("output");
    }
}
