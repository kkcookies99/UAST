 class Solution(object):
    def XXX(self, root):
        if not root:
            return
        res = []
        def dfs(root):
            dfs(root.left)
            res.append(root.val)
            dfs(root.right)
        dfs(root)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


