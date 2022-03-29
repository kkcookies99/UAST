class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root==None:return []
        ans = []
        q = [root]
        while q:
            ans.append(list(map(lambda x:x.val,q)))
            t = []
            for node in q:
                if node.left:t.append(node.left)
                if node.right:t.append(node.right)
            q=t
        return ans

