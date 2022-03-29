 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return 1 == 1
        # 先记录先序遍历，再翻转二叉树然后再记录先序遍历。当没有叶子节点时添加标记'a'
        def dfs(res, root):
            if not root:
                res.append('a')
                return

            res.append(root.val)
            dfs(res, root.left)
            dfs(res, root.right)
        

        res0 = []
        dfs(res0, root)
        # print(res0)
        # 翻转二叉树
        q = [root]
        while q:
            n = len(q)
            for i in range(n):
                node = q.pop(0)
                tmp = node.left
                node.left = node.right
                node.right = tmp
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)

        res1 = []
        dfs(res1, root)
        # print(res1)
        return res0 == res1


