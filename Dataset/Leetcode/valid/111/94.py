class Solution:
    def XXX(self, root: TreeNode) -> int:
        """解题思路：层序遍历"""
        queue = []
        count_ = 0
        if not root: return count_
        queue.append(root)

        while queue:
            size_ = len(queue)
            count_ += 1
            for _ in range(size_):
                node = queue.pop(0)
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)

                if not node.left and not node.right:  # 叶子节点
                    return count_

