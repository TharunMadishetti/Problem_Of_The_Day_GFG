   public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
      ArrayList<ArrayList<Integer>> l= new ArrayList<>();
Node t=head,h=head;
if(head.next==null)
return l;

while(t.next!=null)
t=t.next;
    //System.out.println(t.data);
    

while(t!=h)
{
    if(t.data+h.data>target)
    t=t.prev;
    else if(t.data+h.data<target)
    h=h.next;
   else
    {
        if(t.data<=h.data) break;
        
        ArrayList<Integer> ll= new ArrayList<>();
        ll.add(h.data); 
        ll.add(t.data);
        l.add(ll); 
        t=t.prev;
        h=h.next;
        
    }
  
    
}
return l;
}
