package Solving_Problems_using_java.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        int[] arr = {1,2,3,4,5,6};
        for(int i=0; i<arr.length;i++){
            l1.add(arr[i]);
        }
        Node node = reverseList(l1.head);
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static Node reverseList(Node head) {
        Node temp = new Node(0);
        Node cur = null;
        while(head != null){
            temp.next = head;
            head = head.next;
            temp.next.next = cur;
            cur = temp.next;
        }
        return temp.next;
    }
}
