class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        
        res = 1
        q = [root]
        while q:
            n = len(q)
            for i in range(n):
                node = q.pop(0)
                if node.left and node.right:  # 有两个子节点
                    q.append(node.left)
                    q.append(node.right)
                elif node.left:  # 有左子节点
                    q.append(node.left)
                elif node.right:  # 有右子节点
                    q.append(node.right)
                else:
                    return res
            res += 1

