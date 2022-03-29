class Solution {
    public int XXX(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        TreeNode[] tree=new TreeNode[100000];
        int[] level=new int[100000];
        int front =-1,rear=-1,k;
        TreeNode p;
        rear++;
        tree[rear]=root;
        level[rear]=1;
        while(front<rear){
            front++;
            p=tree[front];
            k=level[front];
            if(p.left==null&&p.right==null){
                return level[front];
            }
            if(p.left!=null){
                rear++;
                tree[rear]=p.left;
                level[rear]=k+1;
            }
            if(p.right!=null){
                rear++;
                tree[rear]=p.right;
                level[rear]=k+1;
            }
        }
        return -1;
    }
}

