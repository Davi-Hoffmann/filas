public class StaticQueue<T> {
    private int top;
    private int base;
    private T[] data;

    public StaticQueue(int size) {
        data = (T[]) new Object[size];
        top = -1;
        base = 0;
    }

    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        top = (top + 1) % data.length;
        data[top] = item;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = data[base];
        if (base == top) {
            base = 0;
            top = -1;
        } else {
            base = (base + 1) % data.length;
        }
        return item;
    }

    public void clear() {
        top = -1;
        base = 0;
    }

    public boolean isFull() {
        return (top + 1) % data.length == base && top != -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
