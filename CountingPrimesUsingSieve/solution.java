class Solution
{
    boolean[] arr;
    public int Count(int L, int R)
    {
        arr=new boolean[R+1];
        Arrays.fill(arr,true);
        // System.out.println(Arrays.toString(arr));
        primes(R);
        int prime=0,composite=0;
        for(int i=L;i<=R;i++)
        {
            if(arr[i])
            prime++;
            else
            composite++;
        }
        if(1<=R && 1>=L)
        composite--;
        // System.out.println(Arrays.toString(arr));
        return composite-prime; 
    }
    public void primes(int R)
    {
        arr[1]=false;
        for(int i=2;i<=R;i++)
        {
            if(arr[i])
            {
                // System.out.println(i);
                int j=2;
                while(i*j<=R)
                {
                    if(arr[i*j])
                    arr[i*j]=false;
                    j++;
                }
            }
           
        }
    }
}
