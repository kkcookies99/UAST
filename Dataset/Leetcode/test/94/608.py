 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        def LRR(root: TreeNode) -> List[int]:
            if not root:
                return []
            return LRR(root.left) + [root.val] + LRR(root.right)
        return LRR(root)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


