class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res = []
        def bfs(root,k):
            if not root:
                return
            if len(res) > k:
                res[k].append(root.val)
            else:
                res.append([root.val])                
            bfs(root.left,k+1)
            bfs(root.right,k+1)
        bfs(root,0)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


