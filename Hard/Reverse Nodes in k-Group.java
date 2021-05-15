class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;        
        
        ListNode temp = head;
        
        int t = 0;
        
        while(temp != null){
            t++;
            temp = temp.next;
        }
                        
        if(t < k) return head;
        
        ListNode nxt = head;
        t = k;
        while(t-- > 0){
            nxt = nxt.next;
        }
        
        head = re(head, k);
        temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }        
        
        //System.out.print(head.val);
        
        temp.next = reverseKGroup(nxt, k);        
        
        return head;        
    }
    
    private static ListNode re(ListNode head, int k){
        if(head == null) return head;
        
        ListNode prev = null;
        
        while(head != null && k > 0){
            ListNode nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
            k--;
        }
        
        return prev;        
    }
    
}