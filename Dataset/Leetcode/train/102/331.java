class Solution {
    public List<List<Integer>> XXX(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        fun(root,list);
        return list;

    }

    public void fun(TreeNode root,List<List<Integer>> list)
    {
        if(root==null)
        {
            return;
        }

        List<TreeNode> list1 = new ArrayList<>();
        list1.add(root);

        while(!list1.isEmpty())
        {
            List<Integer> list2 = new ArrayList<>();

            int size = list1.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode = list1.remove(0);
                list2.add(currentNode.val);

                if(currentNode.left!=null)
                {
                    list1.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    list1.add(currentNode.right);
                }
            }
            list.add(list2);
    
        }

    }

}

