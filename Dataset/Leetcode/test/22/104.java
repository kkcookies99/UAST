 class Solution {
    static class TreeNode{
        int leftCount ;//剩余左括号数量
        int rightCount ;//剩余右括号数量
        String str;//已用括号组成的字符串
        // TreeNode left; //左子节点
        // TreeNode right;//右子节点
    }


    public List<String> XXX(int n) {
        if(n==0) return new ArrayList();
        TreeNode treeNode = new TreeNode();
        treeNode.leftCount = n;
        treeNode.rightCount = n;
        treeNode.str = "";
        List<String> result = new ArrayList<>();
        genarateTree(treeNode,result);
        return result;
    }

    //生成树
    private void genarateTree(TreeNode root,List<String> result){
        //如果没有可用的左右括号了，那么将结果记录下来
        if(root.leftCount == 0 && root.rightCount==0){
            result.add(root.str);
            return ;
        }
        //如果可用的左括号比右括号还多，那么不管当前字符串是什么，都不能组成有效的括号
        if(root.leftCount>root.rightCount){
            return;
        }
        //其他情况下，继续向下生成
        //使用左括号
        if(root.leftCount!=0){
            TreeNode treeNode = new TreeNode();
            treeNode.leftCount = root.leftCount-1;
            treeNode.rightCount = root.rightCount;
            treeNode.str = root.str+"(";
            genarateTree(treeNode,result);
        }
        //使用右括号
        if(root.rightCount!=0){
            TreeNode treeNode = new TreeNode();
            treeNode.leftCount = root.leftCount;
            treeNode.rightCount = root.rightCount-1;
            treeNode.str = root.str+")";
            genarateTree(treeNode,result);
        }
    }

}

