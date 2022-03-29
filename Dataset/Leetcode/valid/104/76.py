class Solution:
    def XXX(self, root: TreeNode) -> int:
        if(root==None):
            return 0
        stack,depth=[],0
        stack.append((1,root))
        while stack:
            cur,node=stack.pop()
            if node!=None:
                depth=max(depth,cur)
            if node:
                stack.append((cur+1,node.left))
                stack.append((cur+1,node.right))
        return depth

