 class Solution {
        private List<Integer> result = new ArrayList<>();

        public boolean XXX(TreeNode root) {
            // 先序遍历，结果递增则为二叉搜索树
            result.clear();
            inOrder(root);
            String order = result.toString();
            // 判断是否递增
            Collections.sort(result);
            String sortedOrder = new TreeSet<>(result).toString();
            return order.equals(sortedOrder);
        }

        private void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            result.add(root.val);
            inOrder(root.right);
        }
    }

