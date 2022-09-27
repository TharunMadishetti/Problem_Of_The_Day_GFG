class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++)
        pq.add(arr[i]);
        long cost=0;
        while(pq.size()>1)
        {
           long c=pq.poll();
           if(!pq.isEmpty())
           c+=pq.poll();
           pq.add(c);
           cost+=c;
        }
        
        return cost;
    
    }
        
}
