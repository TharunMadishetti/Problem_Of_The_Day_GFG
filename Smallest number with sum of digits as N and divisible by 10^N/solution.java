public String digitsNum(int N)
    {
        int t=N/9,temp=N;
        String no="";
        // Code here
        while(t!=0)
        {
            no="9"+no;
            temp-=9;
            t--;
        }
        if(temp>0)
        no=temp+""+no;
        
        StringBuilder s = new StringBuilder(no+"");
        for(int i=0;i<N;i++)
        s.append("0");
        
        return s.toString();
    }
