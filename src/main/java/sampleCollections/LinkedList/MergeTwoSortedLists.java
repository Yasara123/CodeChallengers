package sampleCollections.LinkedList;
//Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
//
//        Example:
//
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode result = null;
       ListNode head = l1;
       while (l1!=null || l2!=null){
           if(l1!=null && l2!=null) {
               while (l1 != null && l2 != null && l1.val >= l2.val) {
                   ListNode n = new ListNode(l2.val);
                   if (result == null) {
                       result = n;
                       head = result;
                   } else {
                       result.next = n;
                       result = result.next;
                   }
                   l2 = l2.next;
               }
               while (l1 != null && l2 != null && l1.val < l2.val) {
                   ListNode n = new ListNode(l1.val);
                   if (result == null) {
                       result = n;
                       head = result;
                   } else {
                       result.next = n;
                       result = result.next;
                   }
                   l1 = l1.next;
               }
           } else if(l1 != null){
               while (l1 != null){
                   ListNode n = new ListNode(l1.val);
                   if (result == null) {
                       result = n;
                       head = result;
                   } else {
                       result.next = n;
                       result = result.next;
                   }
                   l1 = l1.next;
               }
           }else {
               while (l2 != null){
                   ListNode n = new ListNode(l2.val);
                   if (result == null) {
                       result = n;
                       head = result;
                   } else {
                       result.next = n;
                       result = result.next;
                   }
                   l2 = l2.next;
               }
           }
       }

       return head;
    }

    public static void main(String[] args) {

        ListNode l1_n= new ListNode(1);
        l1_n.next =  new ListNode(2);
        l1_n.next.next =  new ListNode(4);

        ListNode l2_n= new ListNode(1);
        l2_n.next =  new ListNode(3);
        l2_n.next.next =  new ListNode(4);
        ListNode result = mergeTwoLists(l1_n,l2_n);
        System.out.println(result.val);
        while (result != null){
            System.out.println(result.val);
            result= result.next;
        }
    }
}

