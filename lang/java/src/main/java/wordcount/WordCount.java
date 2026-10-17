package wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Count the words in text files. */
public final class WordCount {
    private static final String PUNCTUATION = ".,!?:;\"'()";

    private WordCount() {}

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String raw : text.split("\\s+")) {
            String word = strip(raw).toLowerCase(Locale.ROOT);
            if (!word.isEmpty()) {
                counts.merge(word, 1, Integer::sum);
            }
        }
        return counts;
    }

    public static List<Map.Entry<String, Integer>> mostCommon(Map<String, Integer> counts, int n) {
        return counts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(n)
                .toList();
    }

    private static String strip(String word) {
        int start = 0;
        int end = word.length();
        while (start < end && PUNCTUATION.indexOf(word.charAt(start)) >= 0) {
            start++;
        }
        while (end > start && PUNCTUATION.indexOf(word.charAt(end - 1)) >= 0) {
            end--;
        }
        return word.substring(start, end);
    }

    public static void main(String[] args) throws IOException {
        for (String path : args) {
            Map<String, Integer> counts = countWords(Files.readString(Path.of(path)));
            int total = counts.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println(path + ": " + total + " words");
            for (Map.Entry<String, Integer> entry : mostCommon(counts, 3)) {
                System.out.printf("  %-8s %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
