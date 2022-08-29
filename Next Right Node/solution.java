class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}



Node nextRight(Node root, int key)
    {
        if(root.left==null && root.right==null)
        return new Node(-1);
		//Write your code here
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
		    int ls=q.size();
		    for(int i=0;i<ls;i++)
		    {
		        Node cur=q.remove();
		        
		        if(cur.data==key)
		        {
		            if(i<ls-1)
		            return q.remove();
		            else
		            return new Node(-1);
		        }
		        if(cur.left!=null)
		        q.add(cur.left);
		        
		        if(cur.right!=null)
		        q.add(cur.right);
		        
		    }
		}
		return new Node(-1);
    }
