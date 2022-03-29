 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        res=[]
        stack=[]
        cur=root
        while stack or cur:
            while cur:
                stack.append(cur)
                cur=cur.left
            cur=stack.pop()
            res.append(cur.val)
            cur=cur.right
        return res

