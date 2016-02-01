import stack.GenericStack;
import stack.StackException;

public class Main {
    public static void main(String[] args) {
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
