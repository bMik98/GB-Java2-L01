package stack;

import comparator.LengthComparator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GenericStackTest {
    String[] inputArray = {"First", "Second", "Third"};
    ArrayList<String> inputList;
    GenericStack<String> stack;

    @Before
    public void setUp() throws Exception {
        inputList = new ArrayList<>();
        stack = new GenericStack<>(inputArray.length);
    }

    @After
    public void tearDown() throws Exception {
        inputArray = null;
        inputList.clear();
    }

    @Test
    public void testPush() throws Exception {
        stack.push(inputArray[0]);
        assertEquals(inputArray[0], stack.pop());
        stack.push(inputArray[0]);
        stack.push(inputArray[1]);
        stack.push(inputArray[2]);
        stack.pop();
        assertEquals(inputArray[1], stack.pop());
    }

    @Test
    public void testPop() throws Exception {
        stack.push(inputArray[0]);
        assertEquals(inputArray[0], stack.pop());
        stack.push(inputArray[0]);
        stack.push(inputArray[1]);
        stack.push(inputArray[2]);
        stack.pop();
        assertEquals(inputArray[1], stack.pop());
    }

    @Test
    public void testPeek() throws Exception {
        stack.push(inputArray[0]);
        assertEquals(inputArray[0], stack.pop());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, stack.getSize());
        for (int i = 0; i < inputArray.length; i++) {
            stack.push(inputArray[i]);
            assertEquals(i + 1, stack.getSize());
        }
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        stack.push(inputArray[0]);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull() throws Exception {
        for (String inputArrayItem : inputArray) {
            assertFalse(stack.isFull());
            stack.push(inputArray[0]);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testPushAll() throws Exception {
        for (String inputItem : inputArray) {
            inputList.add(inputItem);
        }
        stack.pushAll(inputList);
        assertEquals(inputArray.length, stack.getSize());
        assertTrue(stack.isFull());
        for (int i = inputArray.length - 1; i >= 0; i--) {
            assertEquals(inputArray[i], stack.pop());
        }
        assertEquals(0, stack.getSize());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopAll() throws Exception {
        for (String inputArrayItem : inputArray) {
            stack.push(inputArrayItem);
        }
        stack.popAll(inputList);
        assertEquals(inputArray.length, inputList.size());
        assertTrue(stack.isEmpty());
        Arrays.sort(inputArray, new LengthComparator());
        inputList.sort(new LengthComparator());
        assertEquals(Arrays.deepToString(inputArray), inputList.toString());
    }
}