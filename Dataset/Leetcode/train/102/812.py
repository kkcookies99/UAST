 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        result=[]
        def pre(root,depth):
            if(root==None):return None
            if(depth>=len(result)):
                result.append([])
            result[depth].append(root.val)
            pre(root.left,depth+1)
            pre(root.right,depth+1)
        
        pre(root,0)
        return result
    



