static int smallestSumSubarray(int a[], int size)
    {
        int cur=0,min=Integer.MAX_VALUE,pmin=a[0],p=0;
        for(int i=0;i<a.length;i++) //apply kadane's algo for minimum contiguos subarray sum 
        {
            cur+=a[i];
            if(cur>0)
            cur=0;
            if(cur<min)
            min=cur;
            if(pmin>a[i])       //maintain the minimum element in the whole array
            pmin=a[i];
            if(a[i]>=0)     // count positives
            p++;
        }
        // your code here
if(p==a.length)     // if all are +ve elements then return the minimum element
return pmin;
return min;     // else return minimum contiguous array found
    }
