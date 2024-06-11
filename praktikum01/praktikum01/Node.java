package praktikum01;

/**
 * @author Abhinaya
 */

public class Node {
    int data;
    Node prev;
    Node next;
    
    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}