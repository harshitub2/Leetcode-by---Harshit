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
     List<Integer> al = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return al.get(k-1);
    }
    
    void inorder(TreeNode root)
    {
        if(root==null)
            return;
        
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
        
    }
       
        
        
    
}