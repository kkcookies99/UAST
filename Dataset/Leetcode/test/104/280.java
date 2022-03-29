class Solution {
    public int XXX(TreeNode root) {

/*
        //深度优先
        if(root == null){
            return 0;
        }
        return 1 + Math.max(XXX(root.left),XXX(root.right));
*/
        //广度优先
        if (root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ret = 0;

        while (!queue.isEmpty()){
            ret++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return ret;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


