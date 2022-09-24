

//User function Template for Java

class Solution {
    public static int swapBitGame(long N) {
        // code here
        int c=0;
        while(N!=0)
        {
            if(N%2==1)
            c++;            //counting no. of set bits
            N/=2;
        }
        return c%2==0?2:1;      //if even 1's exists,then game ends at 1 else ends at 2
    }
}
