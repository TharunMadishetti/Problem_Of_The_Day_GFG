public String digitsNum(int N)
    {
        int temp=N;
        String no="";
        // Code here
        while(N/10!=0)
        {
            no="9"+no; //appending begin at nxt digits place
            N-=9;
        }
        if(N>0)
        no=N+no;//if there exit single digit left out
        for(int i=0;i<temp;i++)
        no=no+"0";//appending 0 to generated num
        
        return no;
    }
