 class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public boolean XXX(TreeNode root) {
        helper(root);
        //中序遍历为升序
        for(int i = 1;i < list.size();i++){
            if(list.get(i - 1) >= list.get(i))
                return false;
        }
        return true;
    }
    void helper(TreeNode root){
        if(root == null)  return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}

