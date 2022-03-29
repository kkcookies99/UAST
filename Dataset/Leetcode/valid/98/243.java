 class Solution {
    LinkedList<Integer> queue=new LinkedList<Integer>();
    public boolean XXX(TreeNode root) {
        /*
            利用二叉搜索树的性质可知中序遍历出来应该递增,但若先遍历后再判断是否升序会导致时间复杂度高，为了减少时间复杂度，
        可以维护一个升序的双端队列(其实啥都可以不一定要队列)若新遍历的元素不大于队尾则 该树不符合二叉搜索树
            中序遍历+双端队列
        */
        boolean LChild,RChild;
        LChild=RChild=true;//若没有左(右)子树则左(右)子树为二叉搜索树
        if(root.left!=null) LChild=XXX(root.left);

        if(!queue.isEmpty() && root.val<=queue.getLast()) return false;
        queue.add(root.val);

        if(root.right!=null) RChild=XXX(root.right);

        return LChild&&RChild;
        
    }
}

