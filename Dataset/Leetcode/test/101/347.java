 class Solution {
    public boolean XXX(TreeNode root) {
           return  is(root,root);
    }


    public boolean is(TreeNode rootLeft,TreeNode rootRight){

        if(rootRight==null&&rootLeft==null){//如果都为空,那么就是真
            return true;
        }

        if(rootLeft==null||rootRight==null){//如果一个为空一个不是空,返回假
                return false;
        }
        if(rootLeft.val!=rootRight.val){ //当前值都不为空但不相等,那么返回

                return false;

        }

           return is(rootLeft.left,rootRight.right)&&is(rootLeft.right,rootRight.left);

    }
}

