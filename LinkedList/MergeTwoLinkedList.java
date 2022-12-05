package Solving_Problems_using_java.LinkedList;
/*
* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
* */

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    int len = 0;
    Node head = null;
    public void add(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node temp;
            for(temp = head; temp.next !=null; temp = temp.next);
            temp.next = node;
        }
        len++;
    }
    public void print(){
        Node temp;
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class MergeTwoLinkedList {
    public static void main(String[] args) {
        int[] arr = {5,10,15,40};
        int[] arr1 = {2,3,20};
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for(int i=0; i<arr.length;i++){
            l1.add(arr[i]);
        }
        for(int i=0;i< arr1.length;i++){
            l2.add(arr1[i]);
        }
        l1.print();
        l2.print();
        System.out.println();
        Node cur = mergeSort(l1.head, l2.head);
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
    public static Node mergeSort(Node head1, Node head2){
        Node temp2 = head2;
        Node temp1 = head1;
        LinkedList l3 = new LinkedList();
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                l3.add(temp1.data);
                temp1 = temp1.next;
            }
            else{
                l3.add(temp2.data);
                temp2 = temp2.next;
            }
        }
        while(temp1 != null){
            l3.add(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            l3.add(temp2.data);
            temp2 = temp2.next;
        }

        return l3.head;
    }
}
