
class Solution {
    static int safePos(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=n;i++)
        l.add(i);
        return safe(l,0,k-1);
    } 
    static int safe(ArrayList<Integer> l,int s,int k)
    {
        if(l.size()==1)
        return l.get(0);
        
        s=(s+k)%l.size();
        l.remove(s);
        return safe(l,s,k);
        
    }
};
