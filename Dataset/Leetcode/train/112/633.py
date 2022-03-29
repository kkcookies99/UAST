 class Solution(object):
    def XXX(self, root, s):
        if not root:
            return False
        def dfs(node, res):
            if not node.left and not node.right:
                if sum(res) == s:
                    return True
                else:
                    return False
            x1 = None
            x2 = None
            if node.left:
                res.append(node.left.val)
                x1 = dfs(node.left, res)
                res.pop()
            if node.right:
                res.append(node.right.val)
                x2 = dfs(node.right, res)
                res.pop()
            if x1 or x2:
                return True
            else:
                return False
        return dfs(root, [root.val])

