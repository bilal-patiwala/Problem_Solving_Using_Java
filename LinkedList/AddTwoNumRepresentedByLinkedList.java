package Solving_Problems_using_java.LinkedList;

/* https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1 */

public class AddTwoNumRepresentedByLinkedList {
    public static void main(String[] args) {
        int[] arr = {7,7,0,3,2};
        int[] arr1 = {2,9,6,6,0};
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for(int i=0; i<arr.length;i++){
            l1.add(arr[i]);
        }
        for(int i=0;i< arr1.length;i++){
            l2.add(arr1[i]);
        }
        Node temp = new Node(0);
        Node cur = null;
        while(l1.head != null){
            temp.next = l1.head;
            l1.head = l1.head.next;
            temp.next.next = cur;
            cur = temp.next;
        }
        Node temp1 = new Node(0);
        Node cur1 = null;
        while(l2.head != null){
            temp1.next = l2.head;
            l2.head = l2.head.next;
            temp1.next.next = cur1;
            cur1 = temp1.next;
        }
        Node node = new Node(0);
        cur  = null;
        int num = 0;
        temp = temp.next;
        temp1 = temp1.next;
        while(temp != null && temp1 != null){
            num = num + temp.data + temp1.data;
            node.next = new Node(num%10);
            node.next.next =cur;
            cur = node.next;
            temp = temp.next;
            temp1 = temp1.next;
            num = num/10;
        }
        while(temp!=null){
            num = num + temp.data;
            node.next = new Node(num%10);
            node.next.next =cur;
            cur = node.next;
            temp = temp.next;
            num = num/10;
        }
        while(temp1!=null){
            num = num + temp1.data;
            node.next = new Node(num%10);
            node.next.next =cur;
            cur = node.next;
            temp1 = temp1.next;
            num = num/10;
        }
        if(num > 0){
            node.next = new Node(num);
            node.next.next =cur;
            cur = node.next;
        }

        while(node.next!=null){
            System.out.print(node.next.data);
            node = node.next;
        }
    }
}
