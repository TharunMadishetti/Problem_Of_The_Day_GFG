//Problem link: https://practice.geeksforgeeks.org/problems/sequence-fun5018/1
class Solution
{
    public int NthTerm(int n)
    {
        int mod=(int)(1e9+7);
        int i=1;
        long prev=1;
        while(i<=n)
        {
            prev=((prev%mod)*i)%mod+1;
            i++;
        }
        return (int)prev;
    }
}
