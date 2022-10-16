class Solution {
    public static Node moveToFront(Node head) {
        if(head.next==null)
        return head;
        // code here
        Node temp=head;
        while(head.next.next!=null)
        head=head.next;
        Node temphead=head.next;
        head.next=null;
        temphead.next=temp;
        return temphead;
        
    }
}
  
