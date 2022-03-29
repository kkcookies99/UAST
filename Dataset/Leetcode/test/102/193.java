class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }

        LinkedList<TreeNode> record = new LinkedList<>();
        record.add(root);
        record.add(null);

        List<Integer> temp = new ArrayList<>();

        while(true) {
            TreeNode node = record.removeFirst();
            
            if(node != null) {
                temp.add(node.val);

                if(node.left != null) {
                    record.add(node.left);
                }

                if(node.right != null) {
                    record.add(node.right);
                }
            } else {
                result.add(temp);
                temp = new ArrayList<>();

                if(record.size() == 0) {
                    break;
                }

                record.add(null);
            }
        }

        return result;
    }
}

