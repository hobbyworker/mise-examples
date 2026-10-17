package wordcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class WordCountTest {
    @Test
    void countWordsIgnoresCaseAndPunctuation() {
        Map<String, Integer> counts = WordCount.countWords("mise picks versions. Mise runs tasks!");
        assertEquals(2, counts.get("mise"));
        assertEquals(1, counts.get("tasks"));
        assertEquals(6, counts.values().stream().mapToInt(Integer::intValue).sum());
    }
}
