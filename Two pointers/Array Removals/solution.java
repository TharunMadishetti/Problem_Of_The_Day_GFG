//Problem link : https://practice.geeksforgeeks.org/problems/array-removals/1


class Solution {
    int removals(int[] a, int n, int k) {
        Arrays.sort(a);
        int i=0,j=0;
        int ans=n+1;
        while(i<n)
        {
           
            
            while(j<n && a[j]-a[i]<=k)
            { 
               // System.out.println(i+" "+j+" "+ans);
              
                    ans=Math.min(n-(j-i+1),ans);
                
                j++;
            } 
            if(j<n && a[j]-a[i]>k)
            while(j<n && i<j && a[j]-a[i]>k)
            i++; 
            else 
            i++;
           
        }
        return ans;
    }
}
