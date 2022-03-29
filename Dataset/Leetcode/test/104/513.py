class Solution(object):
    def XXX(self, root):
        def dfs(node, num, ret):
            if node is None:
                return num
            num += 1
            return max(dfs(node.left, num, ret), dfs(node.right, num, ret))
            num -= 1
        return dfs(root, 0, 0)

