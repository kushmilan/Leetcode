class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return t1;
        if(t1 == null) return t2;
        if(t2 == null) return t1;        
        TreeNode t = new TreeNode();
        if(t1 != null && t2 != null){
            t.val = t1.val + t2.val;
            t.right = mergeTrees(t1.right, t2.right);
            t.left = mergeTrees(t1.left, t2.left);
        }
        return t;
    }
}

------------------------------------------------------------------------------------------------------------------