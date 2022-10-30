//Problem link: https://practice.geeksforgeeks.org/problems/chicks-in-a-zoo1159/1
class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        if(N==2)
        return 3;
        long cur=1;
        long[] new_ = new long[6];
        new_[0]=1;
        for(int i=1;i<N;i++)
        {
            long prev=cur;
            cur=(cur-new_[i%6])*3;
            new_[i%6]+=cur-prev;
        }
        return cur;
    }
}
