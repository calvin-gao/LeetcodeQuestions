/*  Merge two sorted linked list

Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4*/

package LinkedList;

public class mergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode head = new ListNode(0);
        ListNode result = head;
        while(l1!= null && l2 != null) {
            if(l1.val <= l2.val){
                result.next = l1;
                l1 = l1.next;
            }
            else{
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        if(l1 != null){
            result.next = l1;
        }else if(l2 != null){
            result.next = l2;
        }
        return head.next;


    }
}