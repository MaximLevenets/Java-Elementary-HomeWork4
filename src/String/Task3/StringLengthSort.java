package String.Task3;

import java.util.Comparator;

public class StringLengthSort implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.length() - t1.length();
    }
}
