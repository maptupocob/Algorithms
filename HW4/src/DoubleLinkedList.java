import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {

    private Node<T> pre;
    private Node<T> post;

    public DoubleLinkedList() {
        pre = new Node<>(null);
        post = new Node<>(null);
        pre.next = post;
        post.prev = pre;
    }

    public void insertTail(T value) {
        Node<T> last = post.prev;
        Node<T> newNode = new Node<>(value);
        newNode.next = post;
        newNode.prev = last;
        last.next = newNode;
        post.prev = newNode;
    }

    public void insertHead(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> first = pre.next;
        newNode.next = first;
        newNode.prev = pre;
        first.prev = newNode;
        pre.next = newNode;
    }

    public T deleteHead() {
        Node<T> head = pre.next;
        Node<T> newHead = head.next;
        T value = head.value;
        pre.next = newHead;
        newHead.prev = pre;
        return value;
    }

    public T deleteTail() {
        Node<T> tail = post.prev;
        Node<T> newTail = tail.prev;
        T value = tail.value;
        post.prev = newTail;
        newTail.next = post;
        return value;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = pre.next;
            @Override
            public boolean hasNext() {
                return (current != null) && (current != post);
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
