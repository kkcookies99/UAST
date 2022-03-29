 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        //直接空树，肯定返回false
        if(root==null){
            return false;
        }
        //如果这个节点是叶子节点，一定要等于sum才true
        if(root.left==null && root.right==null && root.val==sum){
            return true;
        }
        //如果这个节点是叶子节点，还不等于sum，返回false
        if(root.left==null && root.right==null && root.val!=sum){
            return false;
        }
        //如果这个节点还有左右节点，则递归去判断
        if(root.left!=null && root.right!=null){
            return XXX(root.left,sum-root.val)||XXX(root.right,sum-root.val);
        }
        //左结点不是空则右节点一定是空，所以只要递归左结点
        if(root.left!=null){
            //这个参数是sum-root.val。因为把到当前节点的和减去
            return XXX(root.left,sum-root.val);
        }
        //同上，不多说了
        if(root.right!=null){
            return XXX(root.right,sum-root.val);
        } 
        //其实这步是不会走到的。所以不管是true还是false无所谓，为了语法过得去怎么也得写一个       
        return false;
    }
}

