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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head; // Pointer to traverse the list
        
        // Traverse the list until the end
        while (current != null && current.next != null) {
            if (current.val == current.next.val) { 
                // If duplicate is found, skip the duplicate
                current.next = current.next.next;
            } else {
                // Otherwise, move to the next node
                current = current.next;
            }
        } 
        return head; // Return the modified list
   
    }

 }
