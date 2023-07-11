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
    List<String> al = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return al;
      
    }
    
    void dfs(TreeNode root , String path)
    {
          if(root!=null)
        {
            if(root.left==null && root.right==null)
                al.add(path + root.val);
              
              dfs(root.left,path+root.val+"->");
              dfs(root.right,path+root.val+"->");
              
              
        }
    }
    
}