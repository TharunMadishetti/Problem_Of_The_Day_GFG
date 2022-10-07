
//User function Template for Java

class Solution
{ 
    static Node next;
    public static void flatten(Node root)
    {
        //code here
        next=new Node(-1); 
        preorder(root);
    } 
    public static void preorder(Node r) 
    {
        if(r==null) return ;
        Node lt=r.left;
        Node rt=r.right;
        r.left=null;
        r.right=null;
        next.right=r;
        next=next.right;
        preorder(lt);
        preorder(rt);
        
    }
    
}
