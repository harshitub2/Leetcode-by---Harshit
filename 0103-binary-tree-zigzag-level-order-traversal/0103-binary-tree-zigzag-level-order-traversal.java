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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        zigzag(root,ans,q);
        return ans;
    }
    List<List<Integer>> zigzag(TreeNode root, List<List<Integer>> ans, Queue<TreeNode> q)
    {
        if(root==null)
            return ans;
            q.add(root);
        boolean flag = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> al = new ArrayList<>(size);
            for(int i=0;i<size;i++)
            {
            if(q.peek().left!=null )
            
                q.add(q.peek().left);
            
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                if(flag==true)
                    al.add(q.remove().val);
                else
                    al.add(0,q.remove().val);
            }
            flag=!flag;
            ans.add(al);
        }
            return ans;
    }
}