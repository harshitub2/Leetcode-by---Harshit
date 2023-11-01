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
    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> al = new ArrayList<>();
    int mode =0;
    public int[] findMode(TreeNode root) {
        inorder(root);
        for(int key : map.keySet())
        {
            if(map.get(key)>mode)
            {
                al.clear();
                al.add(key);
                mode=map.get(key);
            }
            else if(map.get(key)==mode)
            {
                al.add(key);
            }
        }
       int ans[] = new int[al.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=al.get(i);
        }
        
        return ans;
    }
    void inorder(TreeNode root)
    {
        if(root!=null)
        {
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.left);
        inorder(root.right);
        }
    }
}