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
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        List<Integer> al = new ArrayList<>();
        int maxfreq = -1;
        for(int key:map.keySet())
        {
            int freq = map.get(key);
            if(maxfreq<freq)
            {
                al.clear();
            maxfreq = freq;
            al.add(key);
                continue;
            }
            if(maxfreq==freq)
                al.add(key);
            
        }
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
        

    }
    
    void dfs(TreeNode root)
    {
        if(root!=null)
        {
            map.put(root.val,map.getOrDefault(root.val,0)+1);
        
        dfs(root.left);
        dfs(root.right);
        }
    }
    
    
}