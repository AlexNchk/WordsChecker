import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    Set<String> text = new HashSet<>();

    public void wordsChecker(String lorem) {
        this.text = new HashSet<>(List.of(lorem.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return text.contains(word);
    }

}
