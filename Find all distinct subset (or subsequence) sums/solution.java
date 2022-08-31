class Solution {
    HashSet<Integer> h;

    public int[] DistinctSum(int[] nums) {
        h = new HashSet<>();
        
        System.out.println(Arrays.toString(nums));
        int s = 0;
        for (int i = 0; i < nums.length; i++)
            s += nums[i];
        int[][] dp = new int[nums.length][s + 1];
        for (int i = 0; i < nums.length; i++)
            Arrays.fill(dp[i], -1);
        sum(nums, 0,nums.length-1, dp);
        int i = 0;
        int[] sums = new int[h.size()];
        for (int k : h) {
            sums[i++] = k;
        }
        Arrays.sort(sums);
        return sums;
        // Code here
        
    }

    public void sum(int[] nums, int pre, int i, int[][] dp) {
        
        if (i == 0) {
            h.add(pre);
            h.add(pre+nums[i]);
            dp[i][pre]=1;
            return;
        }
        
            if(dp[i][pre]==1)
            return;
            sum(nums, pre, i - 1, dp);
            sum(nums, pre + nums[i], i - 1, dp);
            
            dp[i][pre]=1;
    }
}
