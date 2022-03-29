 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res =new ArrayList();
        if(root != null)
        {
            Stack<TreeNode> tree = new Stack<>();
            while(!tree.isEmpty() || root != null)
            {
                if(root!= null)
                {
                    tree.push(root);
                    root = root.left;
                }
                else{
                root = tree.pop();
                res.add(root.val);
                root =root.right;
                }

            }

        }

        return res;



    }
}

