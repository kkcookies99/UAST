 class Solution:
    def XXX(self, n: int) -> List[str]:
        """
        本题应该使用树的广度优先搜索（DFS）吧，不过我目前还没看树，所以使用列表解决的，其实也是树的思想。
        """
        l = 2 * n
        # all_result分别存储左右括号个数和字符串
        all_result = [[1, 0, '(']]
        # 因为第一层必须是左括号，所以一共要循环 (2 * n - 1) 次
        for _ in range(l-1):
            # 每次使用新的列表代替旧列表
            temp_result = []
            for left, right, s in all_result:
                # 左括号个数小于n，则可以放'('
                if left < n:
                    new_s = s + '('
                    new_left = left + 1
                    new_right = right
                    temp_result.append([new_left, new_right, new_s])
                
                # 右括号个数小于左括号个数和n，则可以放')'
                if right < left and right < n:
                    new_s = s + ')'
                    new_left = left
                    new_right = right + 1
                    temp_result.append([new_left, new_right, new_s])
            all_result = temp_result
        ans = []
        for left, right, s in all_result:
            ans.append(s)
        return ans

