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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        
        ListNode temp = head, start = head;
        
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        k = size - (k % size);
        
        if(k == size) return head;
        
        temp = head;
        
        while(k-- > 1){
            temp = temp.next;      
        }
        start = temp.next;
        temp.next = null;
        temp = start;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        
        return start;
        
    }
}