class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int i=0,j=n-1;
        long m=arr[n-1]+1;
        for(int x=0;x<n;x++)
        {
            if(x%2!=0)
            arr[x]=(arr[i++]%m)*m+arr[x]%m;
            else
            arr[x]=(arr[j--]%m)*m+arr[x]%m;
        // System.out.println(Arrays.toString(arr));
        }
        for(int x=0;x<n;x++)
        {
            arr[x]=arr[x]/m;
        }
        
    }
    
}

