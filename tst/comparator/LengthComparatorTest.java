package comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by admin on 12.12.2015.
 */
public class LengthComparatorTest {

    @Test
    public void testCompare() throws Exception {
        final String[] stringArray = {"srt1", "sss3", "a", "bb", "b1"};
        ArrayList<String> items = new ArrayList<>();
        for (String arrayItem : stringArray) {
            items.add(arrayItem);
        }
        items.sort(new LengthComparator());
        assertEquals("[a, b1, bb, srt1, sss3]", items.toString());
    }
}