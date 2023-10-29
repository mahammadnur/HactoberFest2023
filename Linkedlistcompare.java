class LinkedList {

    Node head; // head of list
    static Node a;
    static Node b;
    static class Node {

        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    static int compare(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return 1;
        }
        while (node1 != null && node2 != null && node1.data == node2.data) {
            node1 = node1.next;
            node2 = node2.next;
        }

        // if the list are different in size
        if (node1 != null && node2 != null) {
            return (node1.data > node2.data ? 1 : -1);
        }

        // if either of the list has reached end
        if (node1 != null && node2 == null) {
            return 1;
        }
        if (node1 == null && node2 != null) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {



        LinkedList.a = new Node('a');
        LinkedList.a.next = new Node('x');
        LinkedList.a.next.next = new Node('a');
        LinkedList.a.next.next.next = new Node('p');
        LinkedList.a.next.next.next.next = new Node('p');

        LinkedList.b = new Node('s');
        LinkedList.b.next = new Node('x');
        LinkedList.b.next.next = new Node('a');
        LinkedList.b.next.next.next = new Node('p');
        LinkedList.b.next.next.next.next = new Node('p');

        int value;
        value = LinkedList.compare(a, b);
        System.out.println(value);

    }
}
