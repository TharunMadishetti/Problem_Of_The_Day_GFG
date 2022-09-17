class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        int ans=0,lazy=0;  //count lazy sheeps which move slower being at front
        for(int i=c.length-1;i>=0;i--)
        {
            if(k==0)
            break;
            if((c[i]+v[i]*t)>=b)  //if sheep could reach barn
            {
                k--;  
                ans+=lazy;  //how many lazy or slow sheeps in b/w sheep and barn 
            }
            else
            lazy++; //this is a slow sheep can't make it to barn before time t
        }
        return k==0?ans:-1; //if k sheeps couldn't reach barn before time t return -1
    }
}
