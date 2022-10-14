   public static int maximizeSum (int arr[], int n) {
        //Complete the function
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            if(hm.get(arr[i])!=0)
            {
                sum+=arr[i];
                hm.put(arr[i],hm.get(arr[i])-1);
                if(hm.getOrDefault(arr[i]-1,0)!=0)
                hm.put((arr[i]-1),hm.get(arr[i]-1)-1);
            }
           
        }
        return sum;
    }
}
