 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        tem,stack = float("-inf"),[]
        p = root
        while p or stack:
            if p:
                stack.append(p)
                p = p.left
            else:
                p = stack.pop()
                if p.val <= tem:
                    return False
                else:
                    tem = p.val
                p = p.right
        return True

