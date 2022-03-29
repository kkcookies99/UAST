 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        
        # 是叶子节点，返回1
        if not root.left and not root.right:
            return 1

        l = self.XXX(root.left)
        r = self.XXX(root.right)
        # 如果左孩子或者右孩子其中一个为空，则返回不为空的孩子节点的高度+1
        if l==0 or r==0:
            return l+r+1
        return min(l, r) + 1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


