class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        res = []
        i = 0
        def bianli(root,i):
            if root==None:
                return
            if len(res)==i:#开始循环这一层，先添加一个空列表
                res.append([])
            res[i].append(root.val)
            bianli(root.left,i+1)
            bianli(root.right,i+1)

        bianli(root,i)
        return res

