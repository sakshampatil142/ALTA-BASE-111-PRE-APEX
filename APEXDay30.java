public class APEXDay30 {

    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Node first = new Node();
        first.value = 10;

        Node second = new Node();
        second.value = 20;

        first.next = second;

        Node current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}