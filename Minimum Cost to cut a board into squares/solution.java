public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int r=1,c=1;
        int i=X.length-1;
        int j=Y.length-1;
        int res=0;
        while(i>=0 || j>=0)
        {
            int rc=i>=0?X[i]:-1;
            int cc=j>=0?Y[j]:-1;
            if(rc>=cc)
            {
                            
            res+=(rc*r);
            c++;
            i--;
            
            }
        else
        {
            res+=(cc*c);
            r++;
            j--;
        }
        }
        return res;
        
    }
