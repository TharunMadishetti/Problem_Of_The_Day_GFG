
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here  
        int t=0,o=0,z=0;
        for(int i=0;i<n;i++)
        {
            
            if(a[i]==2)
            t++;
            if(a[i]==1)
            o++;
            if(a[i]==0)
            z++;
            
        }
     int i=0;
     while(i<n && z-->0)
     a[i++]=0;
     while(i<n && o-->0)
     a[i++]=1;
     while(i<n && t-->0)
     a[i++]=2;
     
      
    }
}
