 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        #要求：每个子节点的左右节点都不能大于根节点
        #因此，必须记录当前能达到的上下极限
        #(左子树的右节点必须小于限制，右子树的左节点也必须大于限制)
        def tur(rt ,min_ = float('-inf'), max_ = float('inf')):
            #能到底
            if not rt:return True
            if rt.val >= max_ or rt.val <= min_:
                return False
            return tur(rt.left,min_,rt.val) and tur(rt.right,rt.val,max_)
        return tur(root)

