package Solving_Problems_using_java.LinkedList;

public class IsLinkedListPalindrome {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        int[] arr = {1,2,1};
        for(int i=0;i<arr.length;i++){
            l1.add(arr[i]);
        }
        int num = 0;
        Node temp = l1.head;
        while(temp != null){
            num = num*10 + temp.data;
            temp = temp.next;
        }
        temp = l1.head;
        Node l2 = new Node(0);
        Node cur = null;
        while(temp != null){
            l2.next = temp;
            temp = temp.next;
            l2.next.next = cur;
            cur = l2.next;
        }
        int rNum = 0;
        l2 = l2.next;
        while(l2 != null){
            rNum = rNum*10 + l2.data;
            l2 = l2.next;
        }
        if(num == rNum){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
