 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        stack,res=[],[]
        if(root==None):
            return res
        stack.append(root)
        while(stack):
            length=len(stack)
            sub_list=[]
            for _ in range(length):
                node=stack.pop(0)
                sub_list.append(node.val)
                if(node.left):
                    stack.append(node.left)
                if(node.right):
                    stack.append(node.right)
            res.append(sub_list)
        return res


