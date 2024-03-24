package tut8.word_occurance;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.Map;
import java.util.TreeMap;

public class WordOccurrence {
    Map<String,Integer> wordCounts;

    public WordOccurrence(){
        wordCounts = new TreeMap<>();
    }

    public void countWord(String fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word : words) {
                    word = word.replaceAll("[^a-zA-Z]+","").toLowerCase();
                    wordCounts.put(word,wordCounts.getOrDefault(word, 0) + 1);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void writeWordCounts(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Total words: " + getTotalWords() + "\n");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTotalWords() {
        int totalWords = 0;
        for (int count : wordCounts.values()) {
            totalWords += count;
        }
        return totalWords;
    }


}
