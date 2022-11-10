//Problem link: https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1 

class Solution {
    static long jumpingNums(long X) {
        long ans = 1;
        for(int i=1;i<=9;i++)
        ans=Math.max(ans,solve(i,X));
        return ans;
        
    }
    public static long solve(long cur,long X)
    {
        if(cur>X)
        return -1;
        // System.out.println(cur);
        long plus=-1,minus=-1;
        long rem = cur%10;
        if(rem<9 && cur*10+(rem+1)<=X)
        plus=solve(cur*10+(rem+1),X);
        if(rem>0 && cur*10+(rem-1)<=X)
        minus=solve(cur*10+(rem-1),X);
        
        return Math.max(plus,Math.max(cur,minus));
    }
};
