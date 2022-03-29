class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        if root.left and not root.right:
            return 1 + self.XXX(root.left)
        if root.right and not root.left:
            return 1 + self.XXX(root.right)
        return 1 + min(self.XXX(root.left),self.XXX(root.right))

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


