//Problem link:https://practice.geeksforgeeks.org/problems/stepping-numberswrong-output1813/1
class Solution{
    int steppingNumbers(int n, int m){
        int ans=0;
        if(n<=9)
        ans=10-n;
        for(int i=1;i<10;i++)
            ans += solve(n,m,i);
        return ans;
    }
     int solve(int l,int r,int n) {
        if (n > r)
            return 0;
        int ans = (n <= r && n >= l && n > 9) ? 1 : 0;
        if (n % 10 < 9)
            ans += solve(l,r,n * 10 + (n % 10 + 1));
        if (n % 10 > 0)
            ans += solve(l,r,n * 10 + (n % 10 - 1));
        return ans;
    }
}
