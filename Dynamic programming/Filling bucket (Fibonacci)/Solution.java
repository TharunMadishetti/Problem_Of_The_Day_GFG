//Problem link : https://practice.geeksforgeeks.org/problems/filling-bucket0529/1
static int fillingBucket(int N) {
      
        if(N==0)
        return 0;  
        if(N==1 || N==2) 
        return N;
       int prev1=2,prev2=1;
        for(int k=3;k<=N;k++) 
        {
            
          int curr=0;
          curr=(prev1+prev2)%mod;
          prev2=prev1;
          prev1=curr%mod;

        }
    
        return prev1%mod;
    }
