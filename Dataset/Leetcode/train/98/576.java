 class Solution {
    /* 注意用long 测试用例的值到了int边界
    1.递归
    public boolean XXX(TreeNode root) {
           return bfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    boolean bfs(TreeNode root,Long low,Long upper){
       if(root == null)
       return true;
       if(root.val <= low || root.val>=upper )
       return false;
       return bfs(root.left,low,(long)root.val)&&bfs(root.right,(long)root.val,upper);
    }
    */

    /*  递归 中序 
    Long pre = Long.MIN_VALUE;

    public boolean XXX(TreeNode root) {
        if(root == null)
        return true;
        while( root!=null){
           boolean left =  XXX(root.left);
           if(!left)
           return false; //马上返回 ， 剪枝  
           if(root.val <= pre)
           return false;
           pre = (long)root.val;
           boolean right = XXX(root.right);
           return right;
        }
        return false;
    }
    */
     //用栈模拟递归
     public boolean XXX(TreeNode root) {
         if(root == null || (root.left == null && root.right == null) )
         return true;
        Long pre = Long.MIN_VALUE;
        Stack<TreeNode> stack = new Stack();
        while(root !=null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode pop =  stack.pop();
            if(pop.val <= pre)
            return false;
            pre =(long) pop.val;
            root = pop.right;
        }
        return true;

     }


}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


