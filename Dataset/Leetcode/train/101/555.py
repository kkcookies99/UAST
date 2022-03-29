 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        nodes=[root]
        while nodes:
            vals=[i and i.val for i in nodes]
            if vals!=vals[::-1]:
                return False
            nodes=sum(([i.left,i.right] for i in nodes if i),[])
        return True

