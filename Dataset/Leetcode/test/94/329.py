 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        S = []
        cur = root
        res = []
        while True:
            if cur: # 持续进入左侧链
                S.append(cur)
                cur = cur.left
            elif S:
                cur = S.pop() 
                res.append(cur.val) # 开始遍历
                cur = cur.right
            else:
                break
        return res

