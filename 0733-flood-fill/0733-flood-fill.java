class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int no = image[sr][sc];
        int ans[][] = dfs(image,sr,sc,color,no);
        return ans;
    }
    
    int[][] dfs(int [][]image, int sr, int sc, int color,int no)
    {
        if(image[sr][sc]==color || image[sr][sc]!=no)
            return image;
        image[sr][sc]=color;
      
        if(sr>0)
            dfs(image,sr-1,sc,color,no);
         if(sr<image.length-1)
            dfs(image,sr+1,sc,color,no);
        if(sc>0)
            dfs(image,sr,sc-1,color,no);
        if(sc<image[0].length-1)
            dfs(image,sr,sc+1,color,no);
        return image;
        
      
    }
}