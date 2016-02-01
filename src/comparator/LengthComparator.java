package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return str1.compareTo(str2);
        } else {
            return str1.length() - str2.length();
        }
    }
}

