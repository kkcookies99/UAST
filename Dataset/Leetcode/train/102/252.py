class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root==None:
            return []
        arr=[[root]]
        while 1:
            tmp=[]
            for x in arr[-1]:            
                if x.left!=None:
                    tmp.append(x.left)
                if x.right!=None:
                    tmp.append(x.right)
            if tmp==[]:
                return [[node.val for node in x] for x in arr ]
            else:
                arr.append(tmp)

