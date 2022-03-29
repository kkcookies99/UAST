class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def height(root:TreeNode)->int:
            if root==None:
                return 0
            else:
                if (hl:=height(root.left)) == -1 or (hr:=height(root.right)) == -1 or abs(hl-hr)>1:
                    return -1
                else:
                    return max(hl,hr)+1
        return height(root)!=-1

