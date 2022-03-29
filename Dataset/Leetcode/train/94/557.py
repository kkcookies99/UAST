 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        data = {}
        def g(node, floor, offset):
            if not node:
                return
            data[offset] = node.val
            g(node.left, floor+1, offset + -1 / 2 ** floor)
            g(node.right, floor+1, offset + 1 / 2 ** floor)
            
        
        g(root, 0, 0)
        return [val for _, val in sorted(data.items(), key=lambda x:x[0])]

