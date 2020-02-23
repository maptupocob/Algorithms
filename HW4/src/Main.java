public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            myList.insertTail(i);
        }
        printList(myList);
        System.out.println("Deleted value:");
        System.out.println(myList.deleteAt(2));
        System.out.println("List after delete:");
        printList(myList);
        System.out.println();

        SingleLinkedList<Integer> myStack = new SingleLinkedList<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        printList(myStack);
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        printList(myStack);
        System.out.println("Pop: " + myStack.pop());
        printList(myStack);
        System.out.println();

        SingleLinkedList<Integer> myQueue = new SingleLinkedList<>();
        myQueue.enqueue(100);
        myQueue.enqueue(200);
        myQueue.enqueue(300);
        myQueue.enqueue(400);
        printList(myQueue);
        System.out.println("Dequeue: " + myQueue.dequeue());
        printList(myQueue);
        System.out.println("Dequeue: " + myQueue.dequeue());
        printList(myQueue);
        System.out.println("Dequeue: " + myQueue.dequeue());
        printList(myQueue);
        System.out.println();

        DoubleLinkedList<Integer> myDLL = new DoubleLinkedList<>();
        myDLL.insertHead(1000);
        myDLL.insertHead(2000);
        myDLL.insertHead(3000);
        myDLL.insertTail(4000);
        myDLL.insertTail(5000);
        myDLL.insertTail(6000);
        printList(myDLL);
        System.out.println("delete head: " + myDLL.deleteHead());
        printList(myDLL);
        System.out.println("delete tail: " + myDLL.deleteTail());
        printList(myDLL);


    }

    public static <T> void printList(Iterable<T> myList) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (T o : myList) {
            sb.append(o);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        System.out.println(sb);
    }
}
