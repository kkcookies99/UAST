class Solution:
    def XXX_1(self, n: int) -> str:
        """
        递归方法
        :param n:
        :return:
        执行用时：64 ms, 在所有 Python3 提交中击败了31.54%的用户
        内存消耗：15 MB, 在所有 Python3 提交中击败了7.53%的用户
        """
        # if n == 1: 返回初始值
        if n == 1:
            return "1"
        # if n > 1: 对结果进行递归
        elif n > 1:
            s = self.XXX(n - 1)
            t = ""
            i, j = 0, len(s)
            count = 1
            while i < j - 1:
                if s[i] == s[i + 1]:
                    count += 1
                    i += 1
                else:
                    t = t + str(count) + s[i]
                    count = 1
                    i += 1
            t = t + str(count) + s[i]
            return t

