 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root is None:
            return []

        stack = []
        ans = []

        node = root
        while node is not None or stack:
            if node is not None:
                stack.append(node)
                node = node.left  # 先不停地把左边的节点入栈
            else:  # 左边节点为空，该返回了
                node = stack.pop()
                ans.append(node.val)  # 根
                node = node.right  # 右
        
        return ans

