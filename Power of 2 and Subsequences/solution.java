class Solution{
    static HashSet<Long> h;
    static long mod = (long)Math.pow(10,9)+7;
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        h = new HashSet<>();
        int i=0;
        while(Math.pow(2,i)<Math.pow(10,9))
        {
            h.add((long)Math.pow(2,i));
            i++;
        }
        int c=0;
        for(i=0;i<A.size();i++)
        {
            if(h.contains(A.get(i)))
            c++;
        }
        return (long)(Math.pow(2,c)%mod-1);    //nC1+nC2+nC3+....nCn = 2^n -1
    }
    
}
