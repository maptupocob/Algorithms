public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();
        for (int i = 0; i < 5; i++) {
            myList.insertTail(i);
        }
        printList(myList);
        System.out.println();
        System.out.println(myList.deleteAt(2));
        System.out.println();
        printList(myList);
        System.out.println();

        SingleLinkedList<Integer> myStack = new SingleLinkedList<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Peek: " + myStack.peek());
        System.out.println();
        printList(myStack);
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


        DoubleLinkedList<Integer> myDLL = new DoubleLinkedList<>();


    }

    public static void printList(SingleLinkedList<Integer> myList) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object o : myList) {
            sb.append(o);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        System.out.println(sb);
    }
}
