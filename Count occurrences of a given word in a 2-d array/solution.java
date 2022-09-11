public int findOccurrence(char g[][], String t)
    {
        
        int k=0; //for returning
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                k+=search(g,i,j,t,0);     // the string could start at any index of the grid
            }
        }
        return k;
    } 
    public int search(char[][] g,int i,int j,String s,int pre)
    {
     
        
        if(i<0 || j<0 || i>g.length-1 || j>=g[0].length)  //if indices goes out of bounds
        return 0;
        if(g[i][j]!=s.charAt(pre))    //if present character doesn't match with character at g[i][j] then no need to proceed
        return 0;
        if(pre==s.length()-1) found complete string till here hence no need to proceed from here
        return 1; 
        
        char ch = s.charAt(pre);
        g[i][j]='#';  //for marking this as visited
        int sum=0;
        sum+=search(g,i,j+1,s,pre+1);
        sum+=search(g, i, j-1, s, pre+1);
        sum+=search(g, i+1, j, s, pre+1);
        sum+=search(g, i-1, j, s, pre+1);
        g[i][j]=ch;
        return sum;

    }
