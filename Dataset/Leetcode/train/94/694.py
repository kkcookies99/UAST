 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        self.ans=[]
        stack=[]
        p=root
        while(p or stack):
            while(p):
                stack.append(p)
                p=p.left
            p=stack.pop()
            self.ans.append(p.val)
            p=p.right
        return self.ans

