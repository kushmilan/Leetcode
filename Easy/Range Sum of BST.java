/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        
        if(root.val <= R && root.val >= L){
            return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
        }else{
            return rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
        }
    }
}


-----------------------------------------------------------------------------------------------------------------------------------


class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        
        if(root.val > R)
            return rangeSumBST(root.left, L, R);
        
        if(root.val < L)
            return rangeSumBST(root.right, L, R);
            
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);

    }
}

