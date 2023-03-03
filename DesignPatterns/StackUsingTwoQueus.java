package Solving_Problems_using_java.DesignPatterns;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingTwoQueus {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    public static void main(String[] args) {
        push(2);
        push(3);
        System.out.println(pop() + " ");
        System.out.println(pop() + " ");
        System.out.println(pop() + " ");
        push(3);
        push(12);
        push(32);
        push(98);
        System.out.println(pop() + " ");
        System.out.println(pop() + " ");
    }
    static void push(int a)
    {
        q1.add(a);
    }

    //Function to pop an element from stack using two queues.
    static int pop()
    {
        int p = 0;
        if(q1.isEmpty()){
            return -1;
        }
        while(!q1.isEmpty()){
            p = q1.remove();
            if(!q1.isEmpty()){
                q2.add(p);
            }
        }
        while(!q2.isEmpty()){
          q1.add(q2.remove());

        }
        return p;
    }
}
