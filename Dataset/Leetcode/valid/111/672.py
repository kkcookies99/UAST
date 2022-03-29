 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root == None: return 0
        self.depth = float('inf')  # 用这个来记录最小深度
        self.search(root, 1)
        return self.depth
    
    def search(self, node, k):
        if node == None: return
        if node.left == None and node.right == None:
            self.depth = min(self.depth, k)
            return
        self.search(node.left, k + 1)
        self.search(node.right, k + 1)

