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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        
        int size = 0, ind = 0;
        
        ListNode l = head;
        
        while(l != null){
            size++;
            l = l.next;
        }
        
        if(size == 1) return true;
        
        while(head != null){
            ind++;            
            if(!(size % 2 != 0 && ind == (size + 1)/2)){
                if(stack.isEmpty()){
                    stack.push(head.val);
                }else if(head.val == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(head.val);
                }
            }
            head = head.next;
        }
        
        return stack.isEmpty();
    }
}


//-------------------------------------------(Without Extra space)---------------------------------------

class Solution {
    public boolean isPalindrome(ListNode head) {        
        ListNode slow = head;
        ListNode fast = head;                
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }                
        
        slow.next = rev(slow.next);                
        
        slow = slow.next;
        
        fast = head;
        
        while(slow != null){
            if(fast.val != slow.val) return false;
            
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    private static ListNode rev(ListNode curr){
        ListNode prev = null;
        
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev; 
    }
    
}