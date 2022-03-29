 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root==null) return false;
        return def(root,sum);
    }
    
    public boolean def(TreeNode root,int sum){

        //非叶子节点，所以不进行判断
        if(root==null) return false;
        
        //叶子节点
        if(root.right==null&&root.left==null) return (sum-root.val)==0;

        return def(root.left,sum-root.val)||def(root.right,sum-root.val);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


