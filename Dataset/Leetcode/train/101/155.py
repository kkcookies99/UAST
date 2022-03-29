 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        global ls
        ls = []
        self.inorder(root)
        return ls == ls[::-1]
    
    def inorder(self, node):
        if not node:
            return
        self.inorder(node.left)
        ls.append(node.val)
        self.inorder(node.right)   

