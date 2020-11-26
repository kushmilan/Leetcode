class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if( root.val == val) return root;
        if( val < root.val ) root = searchBST( root.left, val);
        else if( val > root.val) root = searchBST( root.right, val);
        return root;
    }
}