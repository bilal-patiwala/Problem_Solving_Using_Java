package Solving_Problems_using_java.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveLoopInList {
    public static void main(String[] args) {
        Node l = new Node(1);
        Node head = l;
        Node temp = head;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(4);
        temp.next.next = temp;
        int n=4;
        Node t = head, prev=head;
        int i=0;
        HashSet<Node> h = new HashSet<>();
        while(t!=null){
            if(h.contains(t)){
                prev.next = null;
                break;
            }
            h.add(t);
            prev = t;
            t=t.next;
        }
        temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static int length(Node head){
        int ret=0;
        Node temp = head;
        while(temp!=null)
        {
            ret += 1;
            temp = temp.next;
        }
        return ret;
    }
}
