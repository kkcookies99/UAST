 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        TreeNode sta[]=new TreeNode[5000];
        int top=0;
        TreeNode p=root,r=null;
        while(p!=null||top!=0){
            if(p!=null){//进栈，遍历左子树
                sta[top++]=p;
                p=p.left;
            }
            else{//p为空
                p=sta[top-1];
                if(p.right!=null&&p.right!=r){
                    //p有右子树且右子树不是刚访问的节点
                    p=p.right;
                }
                else{//可以访问p了
                    if(p.left==null&&p.right==null){
                        int sum=0;
                        for(int i=0;i<top;i++){
                            sum+=sta[i].val;
                        }
                        if(sum==targetSum)return true;
                    }
                    top--;//出栈
                    r=p;
                    p=null;
                }
            }
        }
        return false;
    }
}

