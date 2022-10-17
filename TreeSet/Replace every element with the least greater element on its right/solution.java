class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
      TreeSet<Integer> t=new TreeSet<>();
      ArrayList<Integer> l=new ArrayList<>(n);
      
      for(int i=n-1;i>=0;i--)
      {
          if(t.size()>0 && t.ceiling(arr[i])!=null)
          {
              if(t.ceiling(arr[i])!=arr[i])
              l.add(t.ceiling(arr[i]));
              else if(t.ceiling(arr[i]+1)!=null)
              l.add(t.ceiling(arr[i]+1));
              else 
              l.add(-1);
          }
          else 
          l.add(-1);
          t.add(arr[i]);
      }
      Collections.reverse(l);
      return l;
    }
}
