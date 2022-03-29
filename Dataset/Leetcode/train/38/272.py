class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        if not isinstance(n, int):
            return ""
        
        if n == 1:
            return "1"

        pre_value = self.XXX(n-1)   # 递归
        # 双指针解法
        i = 0
        res = ""
        for j in range(len(pre_value)):
            if pre_value[j] != pre_value[i]:
                res += str(j-i) + pre_value[i]
                i = j

        res += str(len(pre_value)-i) + pre_value[i]
        return res

