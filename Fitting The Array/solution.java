class Solution{
    public static boolean isFit (int arr[], int brr[], int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);   //as we must match every element in arr[] to element in brr[] we can sort the array and match the elements in the sorted form 
        for(int i=0;i<n;i++)
        {
            if(arr[i]>brr[i]) //if for any element there doesn't exist any element in brr[i] such that  element<=arr[i] then return false
            return false;
        }
        return true;  //else you've assigned every element in arr[] to one of the elements in brr[]
    }
    
}
