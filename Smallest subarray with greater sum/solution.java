int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        long sum=0;
        for(int i=0;i<Arr.length;i++)
        sum+=Arr[i];
        long b=0;
        int c=0;
        for(int i=Arr.length-1;i>=0;i--)
        {
            b+=Arr[i];
            sum-=Arr[i];
            c++;
            if(b>sum)
            return  c;
        }
        return c;
    }
