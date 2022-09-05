static int smallestSumSubarray(int a[], int size)
    {
        int cur=0,min=Integer.MAX_VALUE,pmin=a[0],p=0;
        for(int i=0;i<a.length;i++)
        {
            cur+=a[i];
            if(cur>0)
            cur=0;
            if(cur<min)
            min=cur;
            if(pmin>a[i])
            pmin=a[i];
            if(a[i]>=0)
            p++;
        }
        // your code here
if(p==a.length)
return pmin;
return min;
    }
