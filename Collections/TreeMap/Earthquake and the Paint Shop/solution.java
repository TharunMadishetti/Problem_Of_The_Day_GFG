//Problem link:https://practice.geeksforgeeks.org/problems/earthquake-and-the-paint-shop4518/1
class Solution {
    alphanumeric[] sortedStrings(int N, String A[]) {
        TreeMap<String,Integer> h=new TreeMap<>();
        for(int i=0;i<A.length;i++)
        h.put(A[i],h.getOrDefault(A[i],0)+1);
        
        alphanumeric[] ans=new alphanumeric[h.size()];
        
        int i=0;
        for(String s:h.keySet())
            ans[i++]=new alphanumeric(s,h.get(s));
        return ans;
    }
};
