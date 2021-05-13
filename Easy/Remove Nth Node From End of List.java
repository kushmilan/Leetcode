class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        ListNode t = head;
        head = new ListNode(0);
        head.next = t;
        
        int m = 0;
        
        while(t != null){
            m++;
            t = t.next;
        }    
        
        m -= n;
        
        t = head;
        while(m > 0){
            t = t.next;
            m--;
        }        
                        
        t.next = t.next.next;
        
        return head.next;
    }
}