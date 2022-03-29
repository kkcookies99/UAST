 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        result = list()
        self.taverse(root, result)
        return result
    
    def taverse(self, root, result):
        if not root:
            return
        self.taverse(root.left, result)
        result.append(root.val)
        self.taverse(root.right, result)

