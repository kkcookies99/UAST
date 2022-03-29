 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root: return []
        result, stack, p = [], [], root
        while stack or p:
            while p:
                stack.append(p)
                p = p.left

            p = stack.pop()
            result.append(p.val)
            p = p.right
        
        return result

