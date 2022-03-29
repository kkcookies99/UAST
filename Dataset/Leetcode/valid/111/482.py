class Solution:
    def XXX(self, root: TreeNode) -> int:
        # 根节点为空
        if not root:
            return 0
        h1 = self.XXX(root.left)
        h2 = self.XXX(root.right)
        # 根节点左右孩子之一为空 其中一定有一个是0
        # 若左右孩子都为空 则为0 + 0 + 1 = 1
        if not root.left or not root.right:
            return h1 + h2 + 1
        # 根节点左右孩子都不为空
        else:
            return min(h1, h2) + 1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


