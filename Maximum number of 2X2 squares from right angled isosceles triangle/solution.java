class Solution
{
    public static long numberOfSquares(long n)
    {
        //code here
        if(n<4)
        return 0;
        return (((n-2)/2)*((n-2)/2+1))/2;
    }
}
