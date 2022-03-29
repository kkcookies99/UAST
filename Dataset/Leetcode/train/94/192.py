 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        res=[]
        def travel(iroot):
            if iroot!=None:
                travel(iroot.left)
                res.append(iroot.val)
                travel(iroot.right)
        travel(root)
        return res
        
            

