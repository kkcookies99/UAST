 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ret = []

        def traversal(root: TreeNode):
            if root == None:  return
            traversal(root.left)    # 左
            ret.append(root.val) # 中序
            traversal(root.right)   # 右

        traversal(root)
        return ret

