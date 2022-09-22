// import java.util.*;
//  class Solution
//  {
   
//    public static ArrayList<Integer> solve(int[] nums,int n,int k)
//    {
//      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//      ArrayList<Integer> ans=new ArrayList<>();
//      int i=0,j=0;
//      while(i<n)
//      {
//        pq.add(nums[i]);
//        i++;
//        if(pq.size()==k)
//        {
//          ans.add(pq.peek());
//          pq.remove(nums[j++]);
//        }
//      }
//      return ans;
//    }
//  }


//optimized approach


class Solution {
    static ArrayList<Integer> max_of_subarrays(int nums[], int n, int k) {
        // Your code here
    Deque<Integer> pq=new LinkedList<>();
     ArrayList<Integer> ans=new ArrayList<>();
     int i=0,j=0;
     while(i<n)
     {
       while(!pq.isEmpty() && i-pq.peek()>=k)
       pq.removeFirst();
       
      
       while(pq.size()>0 && nums[pq.getLast()]<=nums[i])
       pq.removeLast();
       pq.addLast(i);
       if(i>=k-1)
       {
         ans.add(nums[pq.peek()]);
       }
       
       i++;
     }
     return ans;
   }
}
