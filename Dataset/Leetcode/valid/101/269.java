 class Solution {
    public boolean XXX(TreeNode root) {
        //迭代的话，需要两个栈。
        if(root==null)return true;
        Stack<TreeNode> stk1=new Stack<TreeNode>();
        Stack<TreeNode> stk2=new Stack<TreeNode>();
        TreeNode lft=root.left;
        TreeNode rgt=root.right;
        while(true){    
            if(lft==null&&rgt==null){
                if(stk1.isEmpty()) return true;
                else{
                    lft=stk1.pop();
                    rgt=stk2.pop();
                }
            }
            if(lft==null)return false;
            if(rgt==null)return false;
            if(lft.val!=rgt.val)return false;
            if(lft.right!=null||rgt.left!=null){
                if(lft.right!=null&&rgt.left!=null){
                    stk1.push(lft.right);
                    stk2.push(rgt.left);
                }else return false;
            }
            lft=lft.left;
            rgt=rgt.right;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


