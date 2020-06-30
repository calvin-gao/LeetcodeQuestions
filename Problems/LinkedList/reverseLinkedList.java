/* Reverse a liniked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?*/

package Problems.LinkedList;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;   
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}