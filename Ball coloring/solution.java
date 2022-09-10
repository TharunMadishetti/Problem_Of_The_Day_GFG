 static long noOfWays(long n){
        // code here
        if(n<=2)
        return n*2;
        if(n==3)
        return 4;
        
        return 2+n*(n-1);
        
    }
