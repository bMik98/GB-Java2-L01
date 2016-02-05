import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import comparator.LengthComparator;
import stack.GenericStack;
import stack.StackException;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        testComparator();
        testStack();
    }

    public void testComparator() {
        System.out.println("\nComparator test:");
        List<String> list = Arrays.asList("aaa", "eeee", "cz", "b", "cd");
        System.out.println(list);
        Collections.sort(list, new LengthComparator());
        System.out.println(list);
    }

    public void testStack() {
        System.out.println("\nStack test:");
        GenericStack<String> stack = new GenericStack<>(4);
        try {
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            stack.push("Fourth");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.peek());
            System.out.println(stack.peek());
        } catch (StackException e) {
            e.printStackTrace();
        }
    }
}
