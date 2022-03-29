class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> outarr= new ArrayList<>();
        if (root==null) return outarr;
        int levelnum = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer>  inarr= new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            levelnum--;
            inarr.add(node.val);
           
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
            if (levelnum==0){
                outarr.add(inarr);
                 inarr = new ArrayList();         
                levelnum = queue.size();
            }
        }
        return outarr;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


