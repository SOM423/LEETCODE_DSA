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
    public ListNode deleteMiddle(ListNode head) {

        ListNode temp = head;
       int count=0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        return delete(head,count/2);
        
    }

    public static ListNode delete(ListNode head, int pos)
    {
        if(pos==0)
        {
            head = head.next;
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;
        int N = 0;

        while(temp != null)
        {
            if(N == pos)
            {
                prev.next = temp.next;
                return head;
            }
            else
            {
                prev = temp;
                N++;
            }
            temp = temp.next;
        }
        return head;
    }
}