public boolean XXX(TreeNode root) {
        if(root==null) return true;
        int[] res = traverse(root);
        if(res[0]==1){
            return true;
        }else{
            return false;
        }
    }
    // res[isAVL,子树的高度]
    private int[] traverse( TreeNode root){
        if(root==null) return new int[]{
            1,1
        };
        int[] left = traverse(root.left);
        int[] right = traverse(root.right);
        int res[] = new int[2];
        // 判断当前结点的左右子树是否为AVL ，同时判断左右子树的高度差是否不超过1
        if(left[0]==1 && right[0]==1 &&
            Math.abs(left[1]-right[1])<=1){
                //如果满足，这以当前结点为根节点的二叉树为AVL
                res[0] = 1;
                res[1] = Math.max(left[1],right[1])+1;
        }else{
            // 否则不是AVL
            res[0] = 0;
        }
        return res;
    }

