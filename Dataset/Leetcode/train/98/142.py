 class Solution:
    def XXX(self, root: TreeNode) -> bool:    
        def inorderTraversal(root):
            if root:
                inorderTraversal(root.left)
                nodes.append(root.val)
                inorderTraversal(root.right)
        nodes = []
        inorderTraversal(root)
        return nodes == sorted(set(nodes))

