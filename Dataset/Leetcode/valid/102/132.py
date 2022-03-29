class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ans = []
        q1 = []
        q1.append(root)
        while q1:
            temp = []
            q2 = []  # q2 是q1 层的孩子，下一次循环的时候用它
            for item in q1:
                if item != None:
                    temp.append(item.val)
                    q2.append(item.left)
                    q2.append(item.right)
            if len(temp) !=0:
                ans.append(temp)
            q1 = q2
        return ans

