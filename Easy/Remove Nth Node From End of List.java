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


//------------------------------------------(REcursive)---------------------------

class Solution {
    static int val;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        
        val = n;
        
        return removeFromLast(head);
    }
    
    public static ListNode removeFromLast(ListNode head){                
        
        if(head != null && head.next != null){
            removeFromLast(head.next);

            val--;

            if(val == 0) head.next = head.next.next;
        }
        
        if(val == 1) return head.next;
        
        return head;
        
    }
}