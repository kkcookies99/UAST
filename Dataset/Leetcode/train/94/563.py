 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        ans = []
        def find(node):
            if node.left:
                find(node.left)
            ans.append(node.val)
            if node.right:
                find(node.right)
        find(root)
        return ans

