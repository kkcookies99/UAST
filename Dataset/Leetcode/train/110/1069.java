 public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        //左右子树有一个不平衡，整体就不平衡
        if (!XXX(root.left) || !XXX(root.right)) {
            return false;
        }
        
        //左右子树都平衡，计算高度差
        return Math.abs(height(root.left) - height(root.right)) <= 1;
    }
    
    //求树的高度
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return Math.max(height(root.left), height(root.right)) + 1; //左右两棵子树中，高度最大的，不能忘记根节点，所以加1，至此就是此树的高度
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


