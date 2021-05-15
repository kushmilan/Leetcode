/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {                
        Node t = head;
        while(t != null){
            Node temp = t.next;
            t.next = new Node(t.val);            
            t.next.next = temp;            
            t = temp;
        }        
        
        t = head;            
        
        //Randome assignment 
        while(t != null){
            if(t.random != null){
                t.next.random = t.random.next;                    
            }            
            t = t.next.next;
        }
        
        //Assigning next node
        
        Node headRet = new Node(0);        
        Node copy, cp = headRet;
        t = head;
        
        while(t != null){
            //save the real next for original node
            Node next = t.next.next;
            
            //copy
            copy = t.next;
            cp.next = copy;
            cp = copy;
                        
            t.next = next;
            t = next;
        }
        
        return headRet.next;
    }
}