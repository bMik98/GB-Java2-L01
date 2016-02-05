package comparator;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class LengthComparatorTest {
    @Test
    public void testCompare() throws Exception {
        ArrayList<String> items = new ArrayList<>();
        items.add("srt1");
        items.add("sss3");
        items.add("a");
        items.add( "bb");
        items.add("b1");
        items.sort(new LengthComparator());
        assertEquals("[a, b1, bb, srt1, sss3]", items.toString());
    }
}