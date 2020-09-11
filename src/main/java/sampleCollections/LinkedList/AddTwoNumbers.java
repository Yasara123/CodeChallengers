package sampleCollections.LinkedList;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int buf = 0;
       ListNode result = null;
       ListNode head = null;
       while (l1!=null || l2!=null){
           int v ;
           if(l1!= null && l2!= null )
            v = l1.val+ l2.val+ buf;
           else if(l1!= null  )
               v = l1.val+ buf;
           else v = l2.val+ buf;

           buf =  v/10;
           if(result==null) {
               result = new ListNode(v % 10);
               head = result;
           }else {
               result.next= new ListNode(v % 10);
               result = result.next;
           }

           if(l1!= null && l2!= null ) {
               l1=l1.next;
               l2=l2.next;
           }else if(l1!= null  )
               l1=l1.next;
           else  l2=l2.next;
       }
       if(buf!=0){
           result.next= new ListNode(buf);
           result = result.next;
       }
       return head;
    }

    public static void main(String[] args) {

        ListNode l1_n= new ListNode(2);
        l1_n.next =  new ListNode(4);
        l1_n.next.next =  new ListNode(3);

        ListNode l2_n= new ListNode(5);
        l2_n.next =  new ListNode(6);
        l2_n.next.next =  new ListNode(4);
        ListNode result = addTwoNumbers(l1_n,l2_n);
        System.out.println(result.val);
        while (result.next != null){
            System.out.println(result.next);
            result.next= result.next.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}