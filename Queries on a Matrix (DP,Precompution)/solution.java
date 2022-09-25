class Solution {
    public int[][] solveQueries(int n, int[][] q) {
        // Code here
        int[][] ans=new int[n][n];
        for(int i=0;i<q.length;i++)
        {
            int rs=q[i][0];
            int re=q[i][2];
            for(int j=rs;j<=re;j++)
            {
                ans[j][q[i][1]]+=1;
                if(q[i][3]+1<n)
                ans[j][q[i][3]+1]-=1;
            }
        }
    
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            ans[i][j]+=ans[i][j-1];
        }
        return ans;
    }
}
