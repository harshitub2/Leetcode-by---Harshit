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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return find(set,root,k);
    }
    boolean find(HashSet<Integer> set, TreeNode root, int k)
    {
        if(root==null)
            return false;
        int c = k-root.val;
        if(set.contains(c))
        {
            return true;
        }
        set.add(root.val);
        return find(set,root.left,k) || find(set,root.right,k);
        
    }
}