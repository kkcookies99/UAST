 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return False
        stack = []
        res = []
        node = root
        while stack or node:
            while node:
                stack.append(node)
                node = node.left
            node = stack.pop()
            res.append(node.val)
            node = node.right

        i,j = 0,1
        while j <len(res):
            if res[i]>=res[j]:
                return False
            i+=1
            j+=1
        return True

