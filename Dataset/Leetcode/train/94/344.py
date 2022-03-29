 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if root is None:return []
        ans = []
        queue = [root]
        while root:
            queue.append(root.left)
            root = root.left
        
        while queue:
            cur = queue.pop()
            if cur:
                ans.append(cur.val)
            if cur and cur.right:
                queue.append(cur.right)
                cur = cur.right
                while cur:
                    queue.append(cur.left)
                    cur = cur.left
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


