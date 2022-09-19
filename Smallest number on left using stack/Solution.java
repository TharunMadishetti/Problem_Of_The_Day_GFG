

//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> l = new ArrayList<>();
        Stack<Integer> s =new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.isEmpty())
            {
                l.add(-1);
                s.push(a[i]);
                continue;
            }
            while(!s.isEmpty() && s.peek()>=a[i])
            s.pop();
            if(s.isEmpty())
            l.add(-1);
            else
            l.add(s.peek());
            s.push(a[i]);
        }
        return l;
    }
}
