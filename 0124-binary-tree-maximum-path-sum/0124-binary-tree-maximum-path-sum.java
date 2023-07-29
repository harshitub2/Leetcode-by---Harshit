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
    
    public int maxPathSum(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        findmax(root,al);
        for(int i=0;i<al.size();i++)
        {
            max=Math.max(max,al.get(i));
        }
        return max;
    }
    int findmax(TreeNode root, List<Integer> al)
    {
        if(root==null)
            return 0;
        int left = Math.max(0,findmax(root.left,al));
        int right = Math.max(0,findmax(root.right,al));
        int sum = root.val + left + right;
        al.add(sum);
        return root.val + Math.max(left,right);
    }
}