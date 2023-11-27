import java.util.LinkedList;

import org.w3c.dom.Node;

public class linkedlist {
    static  class Node{
        int data;
        Node next ;
        public void Node(int d){
            this.data  = d;
            this.next=null;
        }
    }

    public static Node head;

    void insert(Node n)
    {
         
        // Empty List
        if (head == null)
            head = n;
 
        // Insert in the beginning of the list
        else
        {
            n.next = head;
            head = n;
        }
    }

    
    
    public static void ll(Node first,Node sec){
        Node temp1 = first;
        Node temp2 = sec;
        int sum1 = 0;
        int sum2 = 0 ;
        while(temp1!=null){
            int n = temp1.data;
            sum1 = sum1*10 + n;
            temp1 = temp1.next;
        }
         while(temp2!=null){
            int n = temp2.data;
            sum2 = sum2*10 + n;
            temp2 = temp2.next;
        }
        int ans = sum1+sum2;
        int add = 0;
        // ans reverse 
        while(ans==0){
            int n = ans%10;
            add = add*10+n;
            ans = ans/10;
        }

        LinkedList<Integer> ll = new LinkedList<>();

        while(add==0){
            int n = add%10;
            
            add = add/10;
        }
        

        

        

    }
}
