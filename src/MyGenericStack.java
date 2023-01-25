import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
