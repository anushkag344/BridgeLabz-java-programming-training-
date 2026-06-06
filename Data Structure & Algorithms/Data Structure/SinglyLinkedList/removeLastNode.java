class GfG {

    // Node class for the linked list
    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    // Function to remove the last 
    // node of the linked list
    static Node removeLastNode(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // If the list has only one node, 
        // delete it and return null
        if (head.next == null) {
            return null;
        }

        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete the last node by making 
        // secondLast point to null
        secondLast.next = null;

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a static linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Removing the last node
        head = removeLastNode(head);

        printList(head);
    }
}