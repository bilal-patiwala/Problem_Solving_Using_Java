package Solving_Problems_using_java.LinkedList;
/* https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1 */
public class MiddleElementInLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        int[] arr = {1,2,3,5,6};
        for(int i=0; i<arr.length;i++){
            l1.add(arr[i]);
        }
        Node temp;
        int count = 0;
        for(temp = l1.head; temp.next!=null; temp = temp.next){
            count++;
        }
        if(count%2 == 0){
            count = count/2;
        }
        else{
            count = count/2+1;
        }

        temp = l1.head;
        while(count != 0){
            temp = temp.next;
            count--;
        }
        System.out.println(temp.data);
    }
}
