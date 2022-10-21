//Problem link : https://practice.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        int[] ans=new int[R*C];
        int i=0,j=0,idx=R*C-1;
        ans[R*C-1]=a[0][0];
        int left=0,right=C,top=0,down=R;
        idx--;
        while(idx>=0 && i>=0 && j>=0 && i<R && j<C)
        {
            while(j+1<right)
            {
                j++;
                ans[idx--]=a[i][j];
            }
            top++;
            if(idx<0)
            return ans;
            while(i+1<down)
            {
                i++;
                ans[idx--]=a[i][j];
            }
            right--;
            if(idx<0)
            return ans;
            while(j-1>=left)
            {
                j--;
                ans[idx--]=a[i][j];
            }
            down--;
            if(idx<0)
            return ans;
            while(i-1>=top)
            {
                i--;
                ans[idx--]=a[i][j];
            }
            left++;
        }
        return ans;
    }
}
