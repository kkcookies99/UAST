 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        if not root.left and not root.right:  # 如果是叶节点,直接检查当前节点是否满足
            if root.val == targetSum:
                return True
            else:
                return False
        if not root.left:  # 没有左孩子,此时一定有右孩子,递归右孩子
            return self.XXX(root.right, targetSum-root.val)
        if not root.right:  # 没有右孩子,此时一定有左孩子,递归左孩子
            return self.XXX(root.left, targetSum-root.val)
        return self.XXX(root.left, targetSum-root.val) or self.XXX(root.right, targetSum-root.val)  # 最后是既有左孩子又有右孩子的情况, 直接两边都检查

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


