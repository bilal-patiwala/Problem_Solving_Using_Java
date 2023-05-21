package Solving_Problems_using_java.LinkedList;

import java.util.ArrayList;

public class RearrangeLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            l.add(arr[i]);
        }
        Node head = l.head;
        rearrangeList(head);
        while(head!=null){
            System.out.print(head.data + " ");
            head=head.next;
        }
    }
    public static void rearrangeList(Node head){
        Node temp = head;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int i=1;
        while(temp!=null){
            if(i%2!=0){
                odd.add(temp.data);
            }
            else{
                even.add(temp.data);
            }
            temp = temp.next;
            i++;
        }
        System.out.println(odd);
        System.out.println(even);
        temp = head;
        System.out.println(temp.data);
        for(int j=0;j<odd.size();j++){
            temp.data = odd.get(j);
            temp = temp.next;
        }
        for(int j=0;j<even.size();j++){
            temp.data = even.get(j);
            temp = temp.next;
        }
    }
}
