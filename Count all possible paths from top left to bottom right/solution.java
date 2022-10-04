

class Solution
{
     static int mod=(int)(1e9+7);
    long numberOfPaths(int m, int n)
    {
       
       long[][] dp=new long[m+1][n+1];
       for(int i=1;i<=m;i++)
       {
           for(int j=1;j<=n;j++)
           {
               if(i==1 && j==1)
                dp[i][j]=1;
               else if(i==1)
               dp[i][j]=dp[i][j-1];  // add only left paths
               else if(j==1)
               dp[i][j]=dp[i-1][j]; //add only top paths
               else 
               dp[i][j]=(dp[i-1][j]%mod+dp[i][j-1]%mod)%mod;  //count possible ways from top and left
               
               dp[i][j]%=mod;
           }
       }
       return dp[m][n]%mod;
    }
    
}
