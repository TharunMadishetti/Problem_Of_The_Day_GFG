class Solution {

    int countDistinctIslands(int[][] g) {
        // Your Code here
        int ans=0;
        Set<List<Integer>> unique= new HashSet<>();
        for(int i=0;i<g.length;i++)
        {
            for(int j=0;j<g[0].length;j++)
            {
                if(g[i][j]==1)
                {
                    List<Integer> path= new ArrayList<>();
                    dfs(g,i,j,path,i,j);
                    unique.add(path);
                }
            }
        }
        return unique.size();
    }
    public void dfs(int[][] g,int i,int j,List<Integer> path,int si,int sj)
    {
        if(i<0 || j<0 || i>g.length-1 || j>g[0].length-1 || g[i][j]==0)
        return ;
        
        g[i][j]=0;
        path.add(si-i);
        path.add(sj-j);
        dfs(g,i,j-1,path,si,sj);
        dfs(g,i+1,j,path,si,sj);
        dfs(g,i-1,j,path,si,sj);
        dfs(g,i,j+1,path,si,sj);
        
    }
}
