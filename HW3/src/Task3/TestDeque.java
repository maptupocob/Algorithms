package Task3;

public class TestDeque {
    public static void main(String[] args) {
        MyDeque myDeque = new MyDeque(15);

        int i =0;
        myDeque.insertRight(++i);
        myDeque.insertRight(++i);
        System.out.println(myDeque);
        myDeque.insertLeft(++i);
        myDeque.insertLeft(++i);
        System.out.println(myDeque);
        int temp = myDeque.removeRight();
        System.out.println(temp);
        temp = myDeque.removeRight();
        System.out.println(temp);
        myDeque.insertRight(++i);
        myDeque.insertRight(++i);
        System.out.println(myDeque);
        myDeque.insertRight(++i);
        myDeque.insertRight(++i);
        System.out.println(myDeque);
        temp = myDeque.removeLeft();
        System.out.println(temp);
        temp = myDeque.removeLeft();
        System.out.println(temp);
        myDeque.insertLeft(++i);
        myDeque.insertLeft(++i);
        System.out.println(myDeque);
        myDeque.insertLeft(++i);
        myDeque.insertLeft(++i);
        System.out.println(myDeque);
        myDeque.insertLeft(++i);
        myDeque.insertLeft(++i);
        System.out.println(myDeque);




    }
}
