/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode mergeTwoSortedLists(ListNode a, ListNode b) {
        if(a == null)
            return b;
        
        if(b == null)
            return a;

        ListNode c = null;

        if(a.val <= b.val){
            c = a;
            c.next = mergeTwoSortedLists(a.next, b);
        }
        else{
            c = b;
            c.next = mergeTwoSortedLists(a, b.next);
        }

        return c;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode midNode = mid(head);

        ListNode a = head;
        ListNode b = midNode.next;
        midNode.next = null;

        a = sortList(a);        
        b = sortList(b);        

        return mergeTwoSortedLists(a, b);
    }
}