class Solution {
    public int XXX(TreeNode root) {
         if(root==null) return 0;
         int leftheight = XXX(root.left);
         int rightheight = XXX(root.right);
         if(leftheight!=0 && rightheight!=0){ 
             return Math.min(leftheight, rightheight)+1;
         }else{ //左子树和右子树可能有一个是空树，这时候需要返回不是空树的那个深度；
                //两个都是空树的话就是一个叶子节点，返回0；
             return leftheight + rightheight +1; 
         }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


