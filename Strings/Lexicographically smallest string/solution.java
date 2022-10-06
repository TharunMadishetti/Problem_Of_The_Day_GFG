class Solution {
   static String lexicographicallySmallest(String S, int k) {
        if(((S.length()-1)&S.length())==0)
        k/=2;
        else
        k*=2;
        if(k>=S.length())
        return "-1";
        int t=k;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            while(!st.isEmpty() && st.peek()>S.charAt(i) && t>0)
            {
                st.pop();
                t--;
            }
            // System.out.println(st);
            st.push(S.charAt(i));
        }
        while(t>0)
        {
            st.pop();
            t--;
        }
         String ans="";
        while(!st.isEmpty())
        ans=st.pop()+ans;
        return ans;
   }
}
