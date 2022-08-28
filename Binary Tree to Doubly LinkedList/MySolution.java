class Solution
{
    Node head=null,prev=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your co
      
      inorder(root); 
      return head;
    } 
    
    void inorder(Node r)
    {
        
        if(r==null)
        return;
       
        inorder(r.left); 
        
        if(head==null)
        {
            head=r;
         
          
            
        } 
        else
        { 
            prev.right=r;
            r.left=prev; 
            
        }
        prev=r;
      
        inorder(r.right);
       // display(head);
    }
}
