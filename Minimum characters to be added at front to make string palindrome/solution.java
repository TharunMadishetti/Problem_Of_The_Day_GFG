
class Solution {
    public static int minChar(String str) {
       int len=str.length();
        int i=0,j=len-1,t=j,ans=0;
      while(i<j)
      {
         
          if(str.charAt(i)==str.charAt(j))
          {
              i++;
              j--;
          }
          else
          {
              ans++;
              i=0;
              j=--t;
          }
      }
      return ans;
      
}
}
