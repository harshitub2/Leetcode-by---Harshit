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
    public List<Integer> largestValues(TreeNode root) {
        
       Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        if(root==null)
            return al;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            
            for(int i=0;i<size;i++)
            {
                TreeNode value = queue.poll();
                if(value.val>max)
                {
                    max = value.val;
                }
                if(value.left!=null)
                {
                    queue.add(value.left);
                }
                if(value.right!=null)
                {
                    queue.add(value.right);
                }
            }
            al.add(max);
        }
        return al;
    }
}