

//User function Template for Java

class Solution { 
    public int minLength(String s, int n) { 
        int i=0;
        Stack<Character> st = new Stack<>();
        String[] str=new String[]{"12","21","34","43","56","65","78","87","09","90"};
        HashSet<String> h = new HashSet<>(Arrays.asList(str));
    	while(i<s.length())
    	{
    	   // st.push(s.charAt(i));
    	    
    	    if(st.isEmpty())
    	    st.push(s.charAt(i));
    	    else
    	    {
    	        if(!h.contains(""+st.peek()+""+s.charAt(i)))
    	        st.push(s.charAt(i));
    	        else
    	        st.pop();
    	    }
    	    
    	    i++;
    	}
    	return st.size();
    }
}
