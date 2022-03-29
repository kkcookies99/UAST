 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        def ismirror(root1,root2):
            if not root1 and not root2: #两个节点都空
                return True
            if (not root1 and root2) or (not root2 and root1):
                return False #只有一个节点为空
            return root1.val == root2.val and ismirror(root1.left,root2.right) and ismirror(root1.right,root2.left)
        return ismirror(root.left,root.right)

