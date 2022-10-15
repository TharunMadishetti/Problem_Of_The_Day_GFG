class Solution {
    boolean isSafe(int i,int j,int[][] g)
    {
        if(i<g.length && i>=0 && j<g[i].length && j>=0 && g[i][j]==1)
        return true;
        return false;
    }
    int shortestPath(int[][] g, int[] src, int[] des) {
        int ans=0;
        Queue<String> q=new LinkedList<>();
        q.add(src[0]+" "+src[1]);
        int[] dx=new int[]{0,1,0,-1};
        int[] dy=new int[]{1,0,-1,0};
        while(!q.isEmpty())
        {
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                
                String[] p=q.poll().split(" ");
                int[] pre=new int[]{Integer.parseInt(p[0]),Integer.parseInt(p[1])};
                g[pre[0]][pre[1]]=0;
                if(pre[0]==des[0] && pre[1]==des[1])
                return ans;
                for (int j = 0; j < 4; j++) {
                    int x = dx[j], y = dy[j];
                    if (isSafe(pre[0] + x, pre[1] + y, g)) {
                        g[pre[0] + x][pre[1] + y] = 0;
                        q.add((pre[0] + x) + " " + (pre[1] + y));
                    }
                }
            }
            ans++;
        }
        return -1;
    }

  // dp approach
    // int solve(int[][] g, int i, int j, int d1, int d2) {
    //     if (i == d1 && d2 == j)
    //         return 0;
    //     // System.out.println(i+" "+j);
    //     g[i][j] = 0;
    //     if (dp[i][j] != -1)
    //         return dp[i][j];
    //     int cost = Integer.MAX_VALUE;
    //     if (i + 1 < g.length && g[i + 1][j] == 1)
    //         cost = Math.min(cost, solve(g, i + 1, j, d1, d2));
    //     if (i - 1 >= 0 && g[i - 1][j] == 1)
    //         cost = Math.min(cost, solve(g, i - 1, j, d1, d2));

    //     if (j + 1 < g[i].length && g[i][j + 1] == 1)
    //         cost = Math.min(cost, solve(g, i, j + 1, d1, d2));
    //     if (j - 1 >= 0 && g[i][j - 1] == 1)
    //         cost = Math.min(cost, solve(g, i, j - 1, d1, d2));

    //     if (cost == Integer.MAX_VALUE)
    //         dp[i][j] = cost;
    //     else
    //         dp[i][j] = cost + 1;
            
    //     g[i][j] = 1;

    //     return dp[i][j];
    // }
}
