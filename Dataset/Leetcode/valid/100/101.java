 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        //都为空
        if(p==q){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        //深度遍历
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while(stack1.size()!=0){
            TreeNode temp1=stack1.peek();
            TreeNode temp2=stack2.peek();
            if(!function(temp1,temp2)){
                return false;
            }
            stack1.pop();
            stack2.pop();
            if(temp1.right!=null){
                stack1.push(temp1.right);
                stack2.push(temp2.right);
            }
            if(temp1.left!=null){
                stack1.push(temp1.left);
                stack2.push(temp2.left);
            }

        }
        return true;
    }
    private boolean function(TreeNode treeNode1,TreeNode treeNode2){
        if(treeNode1.val!=treeNode2.val){
            return false;
        }
        boolean treeNode1Left=false,treeNode1right=false,treeNode2Left=false,treeNode2right=false;
        if(treeNode1.left!=null){
            treeNode1Left=true;
        }
        if(treeNode1.right!=null){
            treeNode1right=true;
        }
        if(treeNode2.left!=null){
            treeNode2Left=true;
        }
        if(treeNode2.right!=null){
            treeNode2right=true;
        }
        if(treeNode1Left==treeNode2Left&&treeNode1right==treeNode2right){
            return true;
        }
        return false;
    }
}

