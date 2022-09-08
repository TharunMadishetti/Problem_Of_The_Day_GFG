class Tree { 
    int t,sum=0;
    int sum(Node root, int k) { 
        t=k;
        inorder(root);
        return sum;
        
        // Code here
    } 
    void inorder(Node r)
    {
        
        if(r==null || t==0)
        return;
       
        inorder(r.left);
        if(t>0){
        sum+=r.data;
        t--; 
        
        
        inorder(r.right);
        }
    }
}
