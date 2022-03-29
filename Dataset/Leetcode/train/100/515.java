 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
              return isTree(p, q);
        }

        public boolean isTree(TreeNode leftTreeNode, TreeNode rightTreeNode) {
            if (leftTreeNode == null && rightTreeNode == null) {
                return true;
            }
            if (leftTreeNode == null || rightTreeNode == null) {
                return false;
            }
            if (leftTreeNode.val != rightTreeNode.val) {
                return false;
            }
            return leftTreeNode.val == rightTreeNode.val && isTree(leftTreeNode.left,rightTreeNode.left) && isTree(leftTreeNode.right,rightTreeNode.right);
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


