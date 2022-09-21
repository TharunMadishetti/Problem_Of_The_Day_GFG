

// User function Template for Java

class Solution{
    static String ReFormatString(String s, int k){
           String ans="";
     s=s.toUpperCase();
     if(s.length()==1 && s.charAt(0)!='-')
     return s;
     
     String[] st=s.split("-");
     int i=st.length-1;
     String part="";
     while(i>-1)
     {
       String p=st[i];
       int m=p.length()-1;
       while(m>=0)
       {
         part=p.charAt(m)+part;
         if(part.length()==k)
         {
           ans=part+ans;
           if(i==0 && m==0)
           ans=ans+"";
           else
           ans="-"+ans;
           part="";
         }
         m--;
       }
       i--;
     }
      ans=part+ans;
     
    if(ans.length()>0 && ans.charAt(0)=='-')
    return ans.substring(1);
      
     return ans;
    }
}
