//Problem link: https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1

class Solution {
    int median(int m[][], int r, int C) {
        int l=m[0][0],h=m[0][0];
        for(int i=0;i<r;i++) {
            l = Math.min(l,m[i][0]);
            h = Math.max(h,m[i][C-1]);
        }
        int mid=(l+h)/2,half=r*C/2;
        
        int ans=h;
        while(l<=h)
        {
            mid=(l+h)/2;
            int c=0;
            for(int[] arr:m)
            {
                c+=search(arr,mid);
            }
            
            if(c<=half)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
                ans=Math.min(ans,mid);
            }
            
        }
           return ans;
    }
    public static int search(int[] a,int v) {
        int lo=0,hi=a.length-1;
        int ans=-1;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(a[mid]<=v) {
                lo=mid+1;
                ans=Math.max(ans,mid);
            } else {
                hi=mid-1;
            }
        }
        return ans+1;
    }
}
