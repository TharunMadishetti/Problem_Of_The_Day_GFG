
//User function Template for Java

class Solution
{
    public  int NthTerm(int N) {
        if(N==1)
        return 1;
        int i = 1;
        if(isPrime(N))
        return 0;
        while (true) {
            if(isPrime(N-i) || isPrime(N+i))
            break;
            i++;
        }
        return i;
    }
    public boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        if(n==2)
        return true;
        int i=2;
        while(i*i<=n)
        {
            if(n%i==0)
            return false;
            i++;
        }
        return true;

    }
}
