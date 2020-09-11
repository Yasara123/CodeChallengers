package mergeKSortedLists;

//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//
//        Merge all the linked-lists into one sorted linked-list and return it.
//
//
//
//        Example 1:
//
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output: [1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        merging them into one sorted list:
//        1->1->2->3->4->4->5->6
public class MergeKSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode head = null;
        if (lists == null || lists.length == 0) return null;

        if (lists.length == 1) return lists[0];
        boolean allNull = false;
        for (ListNode list : lists) {
            allNull = allNull || list != null;
        }
        if (!allNull) {
            return null;
        }
        int minV = Integer.MAX_VALUE;
        int minIdx = 0;
        while (true) {
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && minV >= lists[i].val) {
                    minIdx = i;
                    minV = lists[i].val;
                }
            }
            if (result == null) {
                result = new ListNode(lists[minIdx].val);
                head = result;
                lists[minIdx] = lists[minIdx].next;
            } else {
                result.next = new ListNode(lists[minIdx].val);
                lists[minIdx] = lists[minIdx].next;
                result = result.next;
            }
            allNull = false;
            for (ListNode list : lists) {
                allNull = allNull || list != null;
            }
            if (!allNull) {
                break;
            }
            minV = Integer.MAX_VALUE;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        h1.next = new ListNode(4);
        h1.next.next = new ListNode(5);

        ListNode h2 = new ListNode(1);
        h2.next = new ListNode(3);
        h2.next.next = new ListNode(4);

        ListNode h3 = new ListNode(2);
        h3.next = new ListNode(6);

        ListNode[] lists = {h1, h2, h3};

        ListNode result = mergeKLists(lists);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
