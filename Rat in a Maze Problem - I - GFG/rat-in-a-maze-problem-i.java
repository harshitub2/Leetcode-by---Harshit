//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> al = new ArrayList<>();
        int vis[][] = new int[n][n];
        if(m[0][0]==1)
        path(0,0,m,n,al,"",vis);
        return al;
    }
    static void path(int i, int j, int m[][], int n, ArrayList<String> al, String ans,int vis[][])
    {
        if(i==n-1 && j ==n-1)
        {
        al.add(ans);
        return;
        
    }
    //downward
    if(i+1<n && vis[i+1][j]==0 && m[i+1][j]==1)
    {
        vis[i][j]=1;
        path(i+1,j,m,n,al,ans+"D",vis);
        vis[i][j]=0;
    }
    //left
    if(j-1>=0 && vis[i][j-1]==0 && m[i][j-1]==1)
    {
        vis[i][j]=1;
        path(i,j-1,m,n,al,ans+"L",vis);
        vis[i][j]=0;
    }
    //right
    if(j+1<n && vis[i][j+1]==0 && m[i][j+1]==1)
    {
        vis[i][j]=1;
        path(i,j+1,m,n,al,ans+"R",vis);
        vis[i][j]=0;
    }
     //upward
    if(i-1>=0 && vis[i-1][j]==0 && m[i-1][j]==1)
    {
        vis[i][j]=1;
        path(i-1,j,m,n,al,ans+"U",vis);
        vis[i][j]=0;
    }
}
}