class Solution:
    # 自顶向下递归计算子树的高度
    def height(self, root: TreeNode) -> int:
        # 空树返回 -1
        if not root:
            return -1
        return 1 + max(self.height(root.left), self.height(root.right))
    
    def XXX(self, root: TreeNode) -> bool:
        # 空树也是平衡二叉树
        if not root:
            return True

        # 递归验证左子树高度和右子树高度之差的绝对值是否小于2
        # 同时左子树和右子树必须都为平衡二叉树
        return abs(self.height(root.left) - self.height(root.right)) < 2 \
            and self.XXX(root.left) \
            and self.XXX(root.right)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


