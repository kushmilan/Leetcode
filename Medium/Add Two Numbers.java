class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        
        ListNode res = new ListNode(0);
        ListNode trev = res;
        
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            
            int s = l1val + l2val + carry;
            
            carry = s/10;
            
            trev.next = new ListNode(s % 10);
            trev = trev.next;
            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
        }
        
        if(carry == 1){
            trev.next = new ListNode(1);
        }
        
        return res.next;        
    }
    
}