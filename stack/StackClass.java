//stack bulding using linked list.
// node->head

class StackClass {

    // Node class (building block of linked list)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        Node head; // top of stack

        // check if stack is empty
        boolean isEmpty() {
            return head == null;
        }

        // push operation
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // pop operation
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek operation
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    // main method
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(3);
        s.push(5);
        s.push(7);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}