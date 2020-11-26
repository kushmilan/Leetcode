class Solution {
    public int getDecimalValue(ListNode head) {
        if(head == null){
            return 0;
        }
        String s = "";
        while(head != null){
            s += head.val;
            head = head.next;
        }        
        //System.out.print(s);
        return Integer.parseInt(s, 2);
    }
}

------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int getDecimalValue(ListNode head) {
        int node = 0;
        ListNode n = head;
        while(n != null){
            node++;
            n = n.next;
        }        
        int sum = 0;
        while(head != null){
            if(head.val == 1){
                sum += Math.pow(2, node - 1);                   
            }            
            head = head.next; 
            node--;
        }
        return sum;
    }
}