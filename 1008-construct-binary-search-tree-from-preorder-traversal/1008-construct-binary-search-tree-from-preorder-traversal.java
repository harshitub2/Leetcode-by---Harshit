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
    public TreeNode bstFromPreorder(int[] preorder) {
          return bst(preorder,0,preorder.length-1);  
    }
    TreeNode bst(int preorder[], int start, int end)
    {
        if(start>end)
            return null;
        
        TreeNode node = new TreeNode(preorder[start]);
        int i;
        for(i= start;i<=end;i++)
        {
            if(preorder[i]>node.val)
                break;
        }
        node.left = bst(preorder,start+1,i-1);
        node.right = bst(preorder,i,end);
        
        return node;
    }
}