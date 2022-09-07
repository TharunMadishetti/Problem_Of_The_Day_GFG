public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        int i=0,j=0;
        Stack<Integer> s = new Stack<>();
        while(i<n && j<n)
        {
            if(j<n && op[i]==ip[j])
            {
                i++;
                j++;
            }
            else
            {
                if(!s.isEmpty() && s.peek()==op[i])
                {
                    s.pop();
                    i++;
                    continue;
                }
                while(j<n && op[i]!=ip[j])
                {
                    s.push(ip[j]);
                    j++;
                }
                if(j>=n)
                return 0;
                
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if(op[i]==s.pop())
            i++;
            else
            return 0;
        }
        return 1;
    }
