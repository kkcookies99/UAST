class Solution {
    public List<List<Integer>> XXX(TreeNode root) {

   List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //记录树节点位于二叉树的哪一层上
        Map<TreeNode, Integer> levelMap = new HashMap<>();
        levelMap.put(root,1);
        //记录当前节点的层级
        int curLevel = 1;
        List<Integer> curLevelList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            int curNodeLevel = levelMap.get(curNode);
            if (curNode.left != null) {
                queue.add(curNode.left);
                levelMap.put(curNode.left, curNodeLevel + 1);
            }
            if (curNode.right != null) {
                queue.add(curNode.right);
                levelMap.put(curNode.right, curNodeLevel + 1);
            }

            if (curNodeLevel == curLevel) {
                curLevelList.add(curNode.val);
            } else {
                res.add(curLevelList);
                curLevelList = new ArrayList<>();
                curLevelList.add(curNode.val);
                curLevel = curNodeLevel;
            }
        }
        res.add(curLevelList);
        return res;
    }

