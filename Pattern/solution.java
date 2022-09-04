class Solution{
    static List<String> pattern(int n){
        // code here
        List<String> l = new ArrayList<>();
        int end=0;
        for(int i=0;i<n;i++)
        {
            String s="";
            for(int j=0;j<2*i;j++)
            s+="-";
            int no=end+1;
            for(int k=0;k<(n-i);k++)
            {
                s=s+(""+no+"*");
                
                end=no;
                no++;
            }
            int start=end+((n-i-1)*(n-i))+1;
            for(int k=0;k<(n-i);k++)
            {
                if(k<n-i-1)
                s=s+(""+start+"*");
                else
                s=s+(""+start);
                start++;
            }
            l.add(s);
        }
        return l;
    }
}
