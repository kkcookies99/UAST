 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        stack=[root]
        result=[]
        if not root:
            return result
        tmp=TreeNode(None)
        l_sign=1
        while stack:
            while stack[-1].left and l_sign:
                stack.append(stack[-1].left)
            result.append(stack[-1].val)
            tmp=stack.pop()
            if tmp.right:
                stack.append(tmp.right)
                l_sign=1
            elif not tmp.right and not tmp.left:
                l_sign=0
        return result

