 class Solution(object):
    def XXX(self, root):
        """
        # 方法一：广度优先搜索BFS/迭代
        # 将每层的所有非空节点入栈，判断栈是否镜像对称
        # 栈对称的判断：stack.val == stack.val[::-1]
        stack = [root]
        while stack:
            vals = [s.val for s in stack]
            # 如果非镜像对称，返回False
            if vals != vals[::-1]:
                return False
            # 层序遍历
            for _ in range(len(stack)):
                node = stack.pop(0)
                # 将非空节点的子节点入栈，需补全空子节点
                if node.val != None:
                    stack.append(node.left if node.left else TreeNode(None))
                    stack.append(node.right if node.right else TreeNode(None))
        return True
        """
        # 方法二：深度优先搜索DFS/递归
        # 递归原理：如果左右节点均为空，或者左右子树对称，则二叉树对称
        # 如果左树的左树和右树的右树对称，左树的右树和右树的左树对称，那么左右子树对称
        def treeSym(ltree, rtree):
            if not ltree and not rtree:
                return True
            if ltree and rtree:
                if ltree.val == rtree.val:
                    if treeSym(ltree.left, rtree.right) and treeSym(ltree.right, rtree.left):
                        return True
            return False
        return treeSym(root.left, root.right)