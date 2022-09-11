public int findOccurrence(char g[][], String t)
    {
        
        int k=0;    //for returning answer
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(s.charAt(0)==g[i][j])
                k+=search(g,i,j,t,0);   
                //add all posibilities u would get by starting here
            }
        }
        return k;
    } 
    //recursive method for visiting each and every possibility
    //we need grid to check characters at positions and (i,j) acts as the present location of our
    //character to be matched with present character in target string
    //pre points to char to be matched with
    public int search(char[][] g,int i,int j,String target,int pre)
    {
     
        //out of bounds conditions
        if(i<0 || j<0 || i>g.length-1 || j>=g[0].length)
        return 0;

        //if present char at position doesn't match with present char at target string
        if(g[i][j]!=target.charAt(pre))
        return 0;

        //if we reach to end of target string
        if(pre==target.length()-1)
        return 1;

        //store present char to reassign
        char ch = target.charAt(pre);

        //marking present location as visited
        g[i][j]='#';

        //for storing answers from recursive calls
        int sum=0;
        //recursive calls for moving right,left,bottom and up
        sum+=search(g,i,j+1,target,pre+1);
        sum+=search(g, i, j-1, target, pre+1);
        sum+=search(g, i+1, j, target, pre+1);
        sum+=search(g, i-1, j, target, pre+1);
        g[i][j]=ch; //reassigning the char 

        //returning answer
        return sum;

    }
