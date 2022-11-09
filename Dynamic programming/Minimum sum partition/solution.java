//Problem link: https://practice.geeksforgeeks.org/problems/minimum-sum-partition3317/1

class Solution
{
    int sum=0;
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    for(int k:arr)
	    sum+=k;
	    int[][] dp =new int[arr.length][sum+1];
	    for(int s=0;s<=sum;s++)
	    dp[n-1][s]=Math.abs(sum-2*s);
	    int tsum=sum-arr[n-1];
	    for(int i=arr.length-2;i>=0;i--)
	    {
	        tsum-=arr[i];
	        for(int s=tsum;s>=0;s--)
	        {
        	    int take= dp[i+1][s+arr[i]];
        	    int nt=dp[i+1][s];
        	    dp[i][s]=Math.min(take,nt);
	        }
	        
	    }
	    return dp[0][0];
	} 
  //Recursive algo
	public int solve(int a[],int i,int s)
	{
	    if(i==a.length)
	    return Math.abs(sum-2*s);
	    int take= solve(a,i+1,s+a[i]);
	    int nt=solve(a,i+1,s);
	    return Math.min(take,nt);
	}
}
