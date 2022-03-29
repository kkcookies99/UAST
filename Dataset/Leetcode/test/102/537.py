class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []

        stack, ans = [root], []
        
        while stack:
            layer = []
            size = len(stack)
            for _ in range(size):
                node = stack.pop()
                layer.append(node.val)
                
                if node.right:
                    stack.append(node.right)
                if node.left:
                    stack.append(node.left)
            ans.append(layer)
        return ans

