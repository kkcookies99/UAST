 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        l=self.help(root)
        print(l[0])
        return l[1]
        
    def help(self,p:TreeNode)->List:#[ 0, True  ]
        if not p:
            return [0,True]
        l1=self.help(p.left)
        
        l2=self.help(p.right)
        
        return [1+max(l1[0],l2[0]),False if l1[1]==False or l2[1]==False else abs(l1[0]-l2[0])<=1]

