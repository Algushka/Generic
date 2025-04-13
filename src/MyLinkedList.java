
public class MyLinkedList <T> implements MyList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    @Override
    public void add(T element) {
        Node<T> node = new Node<T>(tail, null, element);
        //можно так : node.prev.next=node;

        size++;
        if (head == null) {
            head = node;
            tail = node;
        }

        tail = node;

    }



    @Override
    public int size() {
        return 0;
    }

    public class Node <T> {
        private Node prev;
        private Node next;
        private T value;


        /* конструктор*/
        public Node(Node prev, Node next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }




}
