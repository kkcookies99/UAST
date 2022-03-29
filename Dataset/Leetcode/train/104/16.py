# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def XXX(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        result = []
        from collections import deque
        que = deque([root])
        while que:
            res = []
            for _ in range(len(que)):
                current = que.popleft()
                res.append(current.val)
                if current.left:
                    que.append(current.left)
                if current.right:
                    que.append(current.right)
            result.append(res)
        return len(result)
            

