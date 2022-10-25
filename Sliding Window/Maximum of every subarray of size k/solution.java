//Problem link: https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList <Integer> m=new ArrayList<>();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<n)
        {
            pq.add(arr[i]);
            if(pq.size()==k){
            m.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
            i++;
        }
        return m;
    }
}
