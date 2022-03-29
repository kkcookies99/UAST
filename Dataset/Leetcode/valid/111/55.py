class Solution:
    def XXX(self, root: TreeNode) -> int:
        self.res = float("inf")
        if not root:
            return 0
        def dfs(node,k):
            if not node.left and not node.right:
                if k<self.res:
                    self.res = k
            if node.left:
                dfs(node.left,k+1)
            if node.right:
                dfs(node.right,k+1)
        dfs(root,1)
        return self.res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


