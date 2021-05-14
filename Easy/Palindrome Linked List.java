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