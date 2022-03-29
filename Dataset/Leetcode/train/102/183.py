class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        stack = [[root.val]]
        res = [[root]]
        i = 0
        while i < len(res):
            tmp = []
            tmp_num = []
            for j in res[i]:
                if j:
                    tmp.append(j.left)
                    if j.left:
                        tmp_num.append(j.left.val)
                    tmp.append(j.right)
                    if j.right:
                        tmp_num.append(j.right.val)
            if tmp_num:
                res.append(tmp)
                stack.append(tmp_num)
            i += 1
        return stack



