 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        stack = []
        ans = []

        if root is None:
            return ans
        
        stack.append(root)
        while stack:
            node = stack.pop()

            if node:
                if node.right:
                    stack.append(node.right)  # 添加右节点
                    
                stack.append(node)  # 添加根节点
                stack.append(None)  # 根节点访问过，但还没有处理，加入一个空节点作为标记
               
                if node.left:
                    stack.append(node.left)  # 添加左节点
            else:  # 遇到空节点时，将下一个节点放进ans
                node = stack.pop()
                ans.append(node.val)
        
        return ans

