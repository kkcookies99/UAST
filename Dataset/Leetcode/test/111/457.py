class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = [root]
        deepth = 1
        while queue:
            size = len(queue)
            for _ in range(size):
                tmp = queue.pop(0)
                if not tmp.left and not tmp.right:
                    return deepth
                if tmp.left:
                    queue.append(tmp.left)
                if tmp.right:
                    queue.append(tmp.right)
            deepth+=1
        return deepth

