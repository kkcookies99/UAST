 class Solution {
    public List<Integer> XXX(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        infix(root, list);
        return list;
    }

    // 前序
    public static void pre(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        // 访问根结点
        list.add(root.val);
        // 遍历左子树
        TreeNode templeft = root.left;
        if(templeft != null){
            pre(templeft, list);
        }
        // 遍历右子树
        TreeNode tempright = root.right;
        if(tempright != null){
            pre(tempright, list);
        }
    }

    // 中序
    public static void infix(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;// 结束递归
        }
        // 遍历左子树
        TreeNode tempLeft = root.left;
        if(tempLeft != null){
            infix(tempLeft, list);
        }
        // 访问根结点
        list.add(root.val);
        // 遍历右子树
        TreeNode tempRight = root.right;
        if(tempRight != null){
            infix(tempRight, list);
        }
    }

    // 后序
    public static void post(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;// 递归结束条件
        }
        // 先遍历左子树
        TreeNode tempLeft = root.left;
        if(tempLeft != null){
            post(tempLeft, list);
        }
        // 再遍历右子树
        TreeNode tempRight = root.right;
        if(tempRight != null){
            post(tempRight, list);
        }
        // 最后访问根结点
        list.add(root.val);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


