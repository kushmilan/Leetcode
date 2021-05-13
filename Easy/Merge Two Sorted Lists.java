class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode ret = l1;
        
        if(l1.val <= l2.val){
            ret = l1;
            l1 = l1.next;
        }else{
            ret = l2;
            l2 = l2.next;
        }
        
        ListNode ans = ret;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ans.next = l1;
                l1 = l1.next;
            }else{
                ans.next = l2;
                l2 = l2.next;
            }   
            ans = ans.next;
        }
        
        while(l1 != null){
            ans.next = l1;
            l1 = l1.next;
            ans = ans.next;
        }
        while(l2 != null){
            ans.next = l2;
            l2 = l2.next;
            ans = ans.next;
        }
        
        return ret;
        
    }
}

//-----------------------------------------------------------------(Recursive)--------------------------------


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }        
    }
}