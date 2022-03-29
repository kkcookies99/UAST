 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        stack,rst = [[root]],[]
        while stack != [[]]:
            i = stack.pop(0)
            rst.append([x.val for x in i if x])
            stack.append(sum([[x.left,x.right] for x in i if x],[]))
        return rst[:-1]
# 执行用时 :28 ms, 在所有 python3 提交中击败了99.68%的用户
# 内存消耗 :13 MB, 在所有 python3 提交中击败了99.59%的用户

